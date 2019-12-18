package restapi.loadtest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import restapi.loadtest.cloudflare.LogEventController;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;




@WebMvcTest(LogEventController.class )
public class Test_LogEventController {

    @Autowired
    private MockMvc mockMvc;

    @DisplayName("testing GetLogEvent method of LogEventController")
    @Test
    public void TestGetLogEvents() {
        try {
            ResultActions res = mockMvc.perform(get("/client/v4/zones/14691A0355/logs/received?start=2019-12-18T18:36:00Z&end=2019-12-18T19:36:00Z&sample=0.1")).andExpect(status().isOk()).andDo(print());
        } catch (Exception e) {
            e.printStackTrace();
        }
//    @DisplayName("testing GetZone method of Zone controller")
//    @Test
//    void TestongetZone() throws Exception {
//
//    }

    }
}
