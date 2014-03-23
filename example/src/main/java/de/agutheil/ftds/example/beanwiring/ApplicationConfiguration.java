package de.agutheil.ftds.example.beanwiring;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	@Bean
	MyService myService() {
		return new MyServiceImplementation();
	}
	
	@Bean 
	MessageDigest messageDigest() throws NoSuchAlgorithmException {
		return MessageDigest.getInstance("SHA-256");
	}
}
