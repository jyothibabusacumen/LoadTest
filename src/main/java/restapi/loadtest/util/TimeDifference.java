package restapi.loadtest.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeDifference {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

	public int diffTime(String start, String end) throws ParseException {

		Date date1 = sdf.parse(start);
		Date date2 = sdf.parse(end);
		return (int) ((date2.getTime() - date1.getTime()) / 1000);
	}

		
	public long diffSecInstance(String start, String end) {
		
		Instant startTime = Instant.parse(start);
		Instant endTime = Instant.parse(end);
		
				
		return ChronoUnit.SECONDS.between(startTime, endTime);
		//return Duration.between(startTime, endTime).getSeconds();

	}
}
