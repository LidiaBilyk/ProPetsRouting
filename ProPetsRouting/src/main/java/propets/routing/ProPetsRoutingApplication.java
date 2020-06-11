package propets.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ProPetsRoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProPetsRoutingApplication.class, args);
	}

}
