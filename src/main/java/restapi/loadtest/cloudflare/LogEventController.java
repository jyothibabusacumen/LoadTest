package restapi.loadtest.cloudflare;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import restapi.loadtest.err.RecordCreationError;
import restapi.loadtest.util.TimeDifference;

/*
 * Response cloudflare Logs 
 * 
 * Ex. https://api.cloudflare.com/client/v4/zones/bf297298d66b7c012f07872427a5abb9/logs/received?start=2019-07-07T15:41:00Z&end=2019-07-07T16:41:00Z&sample=0.1
 * 
 */
@RestController
public class LogEventController {

	private static final Logger logger = LoggerFactory.getLogger(LogEventController.class);
	public static final int EPS=1;
	
	@RequestMapping(value = "/client/v4/zones/{zone-id}/logs/received", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String getLogEvents(@PathParam("zone-id") String zoneid, @RequestParam("start") String start,
			@RequestParam("end") String end, @RequestParam("sample") Optional<String> sample) throws RecordCreationError {

		int seconds = 1;
		float fraction =  1;
		int totalEvent = 1;
		
		//sample 
		if(sample.isPresent()) {
			fraction = Float.parseFloat(sample.get());
			logger.info("Sample Fraction value "+fraction);
		}
		
		// Create Sample Event
		LogEvent logEvent = new LogEvent("66.249.65.182", "www.sacumen.com", "GET",
				"/blog/2ebfrb.php?cmdl=dvl-10-for-sale", "1562515844989000000", "8037", "404", "1562515843502000000",
				"4f2b1715ef80d25a");

//		 Start Time -End Time in seconds
		TimeDifference timediff = new TimeDifference();

		seconds = Math.toIntExact(timediff.diffSecInstance(start, end));
		logger.info("No. of seconds between start and end time:" + seconds);

		//Total Event
		totalEvent = (int) ((seconds*EPS)*fraction);
		logger.info("Number of total events requested: "+totalEvent);
		
		// Generate N seconds log events
		List<LogEvent> logEventList = Collections.nCopies(totalEvent, logEvent);

		// Generate NDJson
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
		logEventList.stream().forEachOrdered(eachLog -> writeWithNewLine(bufferedWriter, eachLog));

		try {
			bufferedWriter.flush();
			
		} catch (IOException e) {
			logger.error("IOException", e);
			throw new RecordCreationError();
		}
		
		logger.info("Sending LogEvents Response...");
		
		return outputStream.toString();
	}

	//Each JSON result appended with new line delimiter 
	private void writeWithNewLine(BufferedWriter writer, LogEvent event) {
		try {
			
			ObjectWriter ow = new ObjectMapper().writer();
			String eventJson = ow.writeValueAsString(event);

			writer.write(eventJson);
			writer.newLine();
			
			//System.out.println(" Json string " + eventJson);

		} catch (IOException e) {
			logger.error("Error while converting the object to json string ", e);
			//System.out.println("Error while converting the object to json string " + e);
		}
	}
}
