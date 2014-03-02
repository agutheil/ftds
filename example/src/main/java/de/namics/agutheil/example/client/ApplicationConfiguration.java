package de.namics.agutheil.example.client;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.MessageProviderFactory;
import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.api.PrinterFactory;
import de.namics.agutheil.example.impl.DefaultMessageProviderFactory;
import de.namics.agutheil.example.impl.DefaultPrinterFactory;

@Configuration
public class ApplicationConfiguration {
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
		return "Hello World";
	}
	
	@Bean 
	PrintStream printStream(){
		return System.out;
	}
}
