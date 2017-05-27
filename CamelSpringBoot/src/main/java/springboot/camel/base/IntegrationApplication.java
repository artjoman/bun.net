package springboot.camel.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.hawt.springboot.EnableHawtio;
import io.hawt.web.AuthenticationFilter;

@SpringBootApplication
@EnableHawtio
public class IntegrationApplication {

	public static void main(String[] args) {
		System.setProperty(AuthenticationFilter.HAWTIO_AUTHENTICATION_ENABLED, "false");
		SpringApplication.run(IntegrationApplication.class, args);
	}
}

