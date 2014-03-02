package de.namics.agutheil.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.MessageProviderFactory;
import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.api.PrinterFactory;
import de.namics.agutheil.example.config.ApplicationConfiguration;

@Configuration
public class HelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		MessageProviderFactory messageProviderFactory = context.getBean("messageProviderFactory", MessageProviderFactory.class);
		MessageProvider messageProvider = messageProviderFactory.createMessageProvider();
		PrinterFactory printerFactory = context.getBean("printerFactory",PrinterFactory.class);
		Printer printer = printerFactory.createPrinter();
		printer.print(messageProvider);
		
	}

}
