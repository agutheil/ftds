package de.agutheil.ftds.example.beanwiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	@Bean
	MyService myService() {
		return new MyServiceImplementation();
	}
}
