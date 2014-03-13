package de.agutheil.ftds.example.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
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
		return "Hello World!";
	}
}
