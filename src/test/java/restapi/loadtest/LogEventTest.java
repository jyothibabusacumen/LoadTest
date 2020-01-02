package restapi.loadtest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


import restapi.loadtest.cloudflare.LogEventController;
import restapi.loadtest.err.RecordCreationError;

import java.util.Optional;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = LogEventController.class)
//@SpringBootTest
public class LogEventTest {

	private MockMvc mockMvc;
	
	//@Autowired
	private WebApplicationContext wac;

	//@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	//@Test
	public void verifyLogEventGen() {
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/client/v4/zones/bf297298d66b7c012f07872427a5abb9/logs/received?start=2019-07-07T15:41:00Z&end=2019-07-07T16:41:00Z&sample=0.1")).andDo(MockMvcResultHandlers.print());
			//System.out.print("Result  "+ result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void verifyGetZone() {
		try {
			MvcResult result=mockMvc.perform(MockMvcRequestBuilders.get("/client/v4/zones").accept(MediaType.APPLICATION_JSON)).andReturn();
			System.out.print("Result  "+ result.getRequest().getContentAsString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	@Test
//	public void testLogEvent() throws RecordCreationError {
//		LogEventController controller = new LogEventController();
//		String output = controller.getLogEvents("Zone_1", "2019-07-07T15:41:00Z", "2019-07-07T15:42:00Z", Optional.of("0.1"));
//		System.out.println("Output is "+output);
//	}


}
