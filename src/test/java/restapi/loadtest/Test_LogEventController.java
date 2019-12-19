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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(LogEventController.class )
public class Test_LogEventController {

    @Autowired
    private MockMvc mockMvc;

    private String response = "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n" +
            "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n" +
            "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n" +
            "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n" +
            "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n" +
            "{\"clientIP\":\"66.249.65.182\",\"clientRequestHost\":\"www.sacumen.com\",\"clientRequestMethod\":\"GET\",\"clientRequestURI\":\"/blog/2ebfrb.php?cmdl=dvl-10-for-sale\",\"edgeEndTimestamp\":\"1562515844989000000\",\"edgeResponseBytes\":\"8037\",\"edgeResponseStatus\":\"404\",\"edgeStartTimestamp\":\"1562515843502000000\",\"rayID\":\"4f2b1715ef80d25a\"}\n";

    @DisplayName("checking the result")
    @Test
    public void TestLogEvents() {
        try {
            mockMvc.perform(get("/client/v4/zones/14691A0355/logs/received?start=2019-12-18T18:36:00Z&end=2019-12-18T18:37:00Z&sample=0.1")).andDo(print()).andExpect(status().isOk()).andReturn();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    @DisplayName("asserting result with dummy result ")
    @Test
    public void TestGetLogEvents() {
        try {
            MvcResult mvcResult = mockMvc.perform(get("/client/v4/zones/14691A0355/logs/received?start=2019-12-18T18:36:00Z&end=2019-12-18T18:37:00Z&sample=0.1")).andExpect(status().isOk()).andReturn();
            Assertions.assertEquals(response, mvcResult.getResponse().getContentAsString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}