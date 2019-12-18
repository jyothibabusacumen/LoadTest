package restapi.loadtest.cloudflare.zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ZoneController {

	private static final Logger logger = LoggerFactory.getLogger(ZoneController.class);
	
	@RequestMapping(value = "/client/v4/zones", method = RequestMethod.GET )
	public Zones getZone(@RequestParam("page") Optional<Integer> page) {

		//Construct the Zone Response
		Account account = new Account("356bdbc0c0ad04811ebd2c05e87f9a39", "nitesh@sacumen.com");
		Meta meta = new Meta(3, true, 1, 100, false, false);
		Owner owner = new Owner("5d6cdaaeb22098088608a00eb55daea1", "user", "nitesh@sacumen.com");
		Plan plan = new Plan("94f3b7b768b0458b56d2cac4fe5ec0f9", "Enterprise Website", 0, "USD", "monthly", true, true,
				"enterprise", false, true);
		Result_info result_info = new Result_info(1, 20, 1, 3, 3);

		List<String> name_servers = new ArrayList<String>();
		name_servers.add("guy.ns.cloudflare.com");
		name_servers.add("roxy.ns.cloudflare.com");

		List<String> original_name_servers = new ArrayList<String>();
		original_name_servers.add("ns23.domaincontrol.com");
		original_name_servers.add("ns24.domaincontrol.com");

		List<String> vanity_name_servers = new ArrayList<String>();
		String vanity_name_servers_ips = null;

		List<String> permissions = new ArrayList<String>();

		permissions.add("#access:edit");
		permissions.add("#access:read");
		permissions.add("#analytics:read");
		permissions.add("#app:edit");
		permissions.add("#auditlogs:read");
		permissions.add("#billing:edit");
		permissions.add("#billing:read");
		permissions.add("#cache_purge:edit");
		permissions.add("#dns_records:edit");
		permissions.add("#dns_records:read");
		permissions.add("#lb:edit");
		permissions.add("#lb:read");
		permissions.add("#legal:edit");
		permissions.add("#legal:read");
		permissions.add("#logs:edit");
		permissions.add("#logs:read");
		permissions.add("#member:edit");
		permissions.add("#member:read");
		permissions.add("#organization:edit");
		permissions.add("#organization:read");
		permissions.add("#ssl:edit");
		permissions.add("#ssl:read");
		permissions.add("#stream:edit");
		permissions.add("#stream:read");
		permissions.add("#subscription:edit");
		permissions.add("#subscription:read");
		permissions.add("#waf:edit");
		permissions.add("#waf:read");
		permissions.add("#webhooks:edit");
		permissions.add("#webhooks:read");
		permissions.add("#worker:edit");
		permissions.add("#worker:read");
		permissions.add("#zone:edit");
		permissions.add("#zone:read");
		permissions.add("#zone_settings:edit");
		permissions.add("#zone_settings:read");

		List<String> errors = new ArrayList<String>();
		List<String> messages = new ArrayList<String>();
		List<Result> result = new ArrayList<Result>();

		Result result1 = new Result("bf297298d66b7c012f07872427a5abb9", "sacumen.com", "active", false, "full", 0,
				name_servers, original_name_servers, "godaddy.com, llc", "godaddy", "2019-06-26T10:04:25.169302Z",
				"2018-12-07T05:23:58.378066Z", "2018-12-07T07:33:24.197960Z", vanity_name_servers,
				vanity_name_servers_ips, meta, owner, account, permissions, plan);

		result.add(result1);

		//final response
		Zones zone = new Zones(result, result_info, true, errors, messages);

		logger.info("Sending Zone Response ");
		
		return zone;

	}

}
