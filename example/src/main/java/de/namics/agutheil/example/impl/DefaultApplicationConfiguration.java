package de.namics.agutheil.example.impl;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.MessageProviderFactory;
import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.api.PrinterFactory;

@Configuration
public class DefaultApplicationConfiguration {
	@Bean
	MessageProvider messageProvider(){
		return messageProviderFactory().createMessageProvider();
	}
	@Bean
	Printer printer(){
		return printerFactory().createPrinter();
	}
	
	@Bean
	MessageProviderFactory messageProviderFactory(){
		return new DefaultMessageProviderFactory(message());
	}
	
	@Bean
	PrinterFactory printerFactory(){
		return new DefaultPrinterFactory(printStream());
	}
	
	@Bean
	String message(){
		return "Default Message";
	}
	
	@Bean 
	PrintStream printStream(){
		return System.out;
	}
}
