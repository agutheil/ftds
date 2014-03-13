package de.agutheil.ftds.example.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	String message(){
		return "Hello World!";
	}
	
}
