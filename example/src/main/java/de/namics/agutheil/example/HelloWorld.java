package de.namics.agutheil.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.config.ApplicationConfiguration;

@Configuration
public class HelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		MessageProvider messageProvider = context.getBean("messageProvider", MessageProvider.class);
		Printer printer = context.getBean("printer",Printer.class);
		printer.print(messageProvider);
		
	}

}
