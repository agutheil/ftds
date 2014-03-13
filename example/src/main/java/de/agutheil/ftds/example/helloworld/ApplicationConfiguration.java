package de.agutheil.ftds.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ApplicationConfiguration {
	@Autowired
	Environment env;
	
	@Bean
	MessagePrinter messagePrinter(MessageProvider messageProvider) {
		DefaultMessagePrinter printer = new DefaultMessagePrinter();
		printer.setMessageProvider(messageProvider);
		printer.setOutput(System.out);
		return printer;
	}
	
	@Bean
	MessageProvider messageProvider(String message) {
		DefaultMessageProvider provider = new DefaultMessageProvider(message);
		return provider;
	}
	
	@Bean
	String message(){
		return env.getProperty("message");
	}
}
