package restapi.loadtest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import restapi.loadtest.cloudflare.zone.ZoneController;
import restapi.loadtest.cloudflare.zone.Zones;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ZoneController.class)
public class Test_ZoneController {
    @Autowired
    MockMvc mockMvc;

   @ Mock
    ZoneController zoneController;
    @Mock
    Zones zones;
    // dummy response for testing

     private String response = "{\"result\":[{\"id\":\"bf297298d66b7c012f07872427a5abb9\",\"name\":\"sacumen.com\",\"status\":\"active\",\"paused\":false,\"type\":\"full\",\"development_mode\":0,\"name_servers\":[\"guy.ns.cloudflare.com\",\"roxy.ns.cloudflare.com\"],\"original_name_servers\":[\"ns23.domaincontrol.com\",\"ns24.domaincontrol.com\"],\"original_registrar\":\"godaddy.com, llc\",\"original_dnshost\":\"godaddy\",\"modified_on\":\"2019-06-26T10:04:25.169302Z\",\"created_on\":\"2018-12-07T05:23:58.378066Z\",\"activated_on\":\"2018-12-07T07:33:24.197960Z\",\"vanity_name_servers\":[],\"vanity_name_servers_ips\":null,\"meta\":{\"step\":3,\"wildcard_proxiable\":true,\"custom_certificate_quota\":1,\"page_rule_quota\":100,\"phishing_detected\":false,\"multiple_railguns_allowed\":false},\"owner\":{\"id\":\"5d6cdaaeb22098088608a00eb55daea1\",\"type\":\"user\",\"email\":\"nitesh@sacumen.com\"},\"account\":{\"id\":\"356bdbc0c0ad04811ebd2c05e87f9a39\",\"name\":\"nitesh@sacumen.com\"},\"permissions\":[\"#access:edit\",\"#access:read\",\"#analytics:read\",\"#app:edit\",\"#auditlogs:read\",\"#billing:edit\",\"#billing:read\",\"#cache_purge:edit\",\"#dns_records:edit\",\"#dns_records:read\",\"#lb:edit\",\"#lb:read\",\"#legal:edit\",\"#legal:read\",\"#logs:edit\",\"#logs:read\",\"#member:edit\",\"#member:read\",\"#organization:edit\",\"#organization:read\",\"#ssl:edit\",\"#ssl:read\",\"#stream:edit\",\"#stream:read\",\"#subscription:edit\",\"#subscription:read\",\"#waf:edit\",\"#waf:read\",\"#webhooks:edit\",\"#webhooks:read\",\"#worker:edit\",\"#worker:read\",\"#zone:edit\",\"#zone:read\",\"#zone_settings:edit\",\"#zone_settings:read\"],\"plan\":{\"id\":\"94f3b7b768b0458b56d2cac4fe5ec0f9\",\"name\":\"Enterprise Website\",\"price\":0,\"currency\":\"USD\",\"frequency\":\"monthly\",\"is_subscribed\":true,\"can_subscribe\":true,\"legacy_id\":\"enterprise\",\"legacy_discount\":false,\"externally_managed\":true}}],\"result_info\":{\"page\":1,\"per_page\":20,\"total_pages\":1,\"count\":3,\"total_count\":3},\"success\":true,\"errors\":[],\"messages\":[]}";

    @DisplayName("checking the response")
    @Test
   public void Test1() throws Exception {
            mockMvc.perform(get("/client/v4/zones?page =1")).andExpect(status().isOk()).andDo(print());
    }

    @DisplayName("testing  geturl response with dummy response ")
    @Test
    public void Test2() throws Exception {

        MvcResult mvcResult = mockMvc.perform(get("/client/v4/zones?page =")).andExpect(status().isOk()).andReturn();
        Assertions.assertEquals(response,mvcResult.getResponse().getContentAsString());
        Assertions.assertEquals(200,mvcResult.getResponse().getStatus(), "should equal with 200 status");
        assertEquals(response,mvcResult.getResponse().getContentAsString().trim(), "should equal even when we trim it");

    }

//    @DisplayName("testing getzone method with random pramaters")
//    @Test
//    public void Test3(){
//        Mockito.when(zoneController.getZone(java.util.Optional.of(1))).thenReturn(new Zones(any(),any(),any(),any(),any()));
//        Zones k=zoneController.getZone(java.util.Optional.of(1));
//    }
    }
