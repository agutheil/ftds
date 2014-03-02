package de.namics.agutheil.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.core.CoreApplicationConfiguration;
import de.namics.agutheil.example.impl.DefaultApplicationConfiguration;

@Configuration
public class HelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CoreApplicationConfiguration.class, DefaultApplicationConfiguration.class, ApplicationConfiguration.class);
		MessageProvider messageProvider = context.getBean("messageProvider", MessageProvider.class);
		Printer printer = context.getBean("printer",Printer.class);
		printer.print(messageProvider);
		
	}

}
