package de.namics.agutheil.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.namics.agutheil.example.api.MessageProviderFactory;
import de.namics.agutheil.example.api.PrinterFactory;
import de.namics.agutheil.example.impl.DefaultMessageProviderFactory;
import de.namics.agutheil.example.impl.DefaultPrinterFactory;

@Configuration
public class ApplicationConfiguration {
	@Bean
	MessageProviderFactory messageProviderFactory(){
		return new DefaultMessageProviderFactory("Hello World");
	}
	
	@Bean
	PrinterFactory printerFactory(){
		return new DefaultPrinterFactory();
	}
}
