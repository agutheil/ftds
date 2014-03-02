package de.namics.agutheil.example.core;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.namics.agutheil.example.api.MessageProviderFactory;
import de.namics.agutheil.example.api.PrinterFactory;
import de.namics.agutheil.example.impl.DefaultMessageProviderFactory;
import de.namics.agutheil.example.impl.DefaultPrinterFactory;

@Configuration
public class DefaultApplicationConfiguration {

	@Bean(name="messageProvider")
	SpringMessageProviderFactoryBean springMessageProviderFactoryBean() {
		return new SpringMessageProviderFactoryBean(messageProviderFactory());
	}
	
	@Bean
	MessageProviderFactory messageProviderFactory(){
		return new DefaultMessageProviderFactory(message());
	}
	
	@Bean(name="printer")
	SpringPrinterFactoryBean springPrinterFactoryBean() {
		return new SpringPrinterFactoryBean(printerFactory());
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
