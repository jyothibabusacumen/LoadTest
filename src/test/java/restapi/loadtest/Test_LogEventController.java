package restapi.loadtest;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import restapi.loadtest.cloudflare.LogEventController;
import restapi.loadtest.err.RecordCreationError;

import static com.sun.javaws.JnlpxArgs.verify;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(LogEventController.class )
public class Test_LogEventController {

    @Autowired
    private MockMvc mockMvc;
    @Mock
    LogEventController logEventController;
    // mock response
    private String response = "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n" +
            "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n" +
            "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n" +
            "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n" +
            "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n" +
            "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n";

    @DisplayName("checking the result")
    @Test
    public void TestLogEvents() throws Exception {
            mockMvc.perform(get("/client/v4/zones/14691A0355/logs/received?start=2019-12-18T18:36:00Z&end=2019-12-18T18:37:00Z&sample=0.1")).andDo(print()).andExpect(status().isOk()).andReturn();
        }

    @DisplayName("testing geturl with mock response ")
    @Test
    public void TestGetLogEvents() throws Exception {

    // arrange / given
            when(logEventController.getLogEvents(any(),any(),any(),any())).thenReturn(response);
            MvcResult mvcResult = mockMvc.perform(get("/client/v4/zones/14691A0355/logs/received?start=2019-12-18T18:36:00Z&end=2019-12-18T18:37:00Z&sample=0.1")).andExpect(status().isOk()).andReturn();
    // act
        String k =  logEventController.getLogEvents("14691A0355","2019-12-18T18:36:00Z","2019-12-18T18:37:00Z", java.util.Optional.of("0.1"));
    // assert
        Assertions.assertEquals(response, mvcResult.getResponse().getContentAsString(),"should equal");
        assertTrue(k.equalsIgnoreCase(response), "should be true when we ignore case");
        assertNotEquals(response,k.trim(),"should not equal ");
        assertNotEquals(10,k.length(),"should not equal actual length is more ");
        assertFalse(k.isEmpty(), "should be false because k is not empty");
    }

    @DisplayName("testing method logEventsmethod with specific parameter")
    @Test
    public void TestgetLogEvents_method() throws RecordCreationError {

        //  given / arrange
        when(logEventController.getLogEvents("14691A0355","2019-12-18T18:36:00Z","2019-12-18T18:37:00Z", java.util.Optional.of("0.1"))).thenReturn(response);
        // act
        String k =  logEventController.getLogEvents("14691A0355","2017-12-18T18:36:00Z","2019-12-18T18:37:00Z", java.util.Optional.of("0.1"));
        // assert
        Assertions.assertNotEquals(response,k, "should not be equal beacause we are passing diff parameters while method calling");
    }

    @DisplayName("testing method logEventsmethod with random parameter")
    @Test
    public void TestgetLogEvents_method_withspecificparam() throws RecordCreationError {
        //  given / arrange
        when(logEventController.getLogEvents(any(),any(),any(),any())).thenReturn(response);
        // act
        String k =  logEventController.getLogEvents("14691A0355","213","5454", java.util.Optional.of("6546"));
        // assert
        Assertions.assertNotEquals(response,k.trim(), "should not equal when we trim it");
        Assertions.assertEquals(response,k,"should be equal");

    }
}