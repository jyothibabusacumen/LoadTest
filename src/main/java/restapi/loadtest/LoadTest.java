package restapi.loadtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello LoadTester!
 *  - Support Cloudflare APIs
 *
 */
@SpringBootApplication
public class LoadTest {
	
	private static final Logger logger = LoggerFactory.getLogger(LoadTest.class);
	
	public static void main(String[] args) {
		System.out.println("Hello LoadTest!");
		logger.info("Starting LoadTest");
		SpringApplication.run(LoadTest.class, args);

	}

}
