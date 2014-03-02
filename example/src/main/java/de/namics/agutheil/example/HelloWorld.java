package de.namics.agutheil.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import de.namics.agutheil.example.api.Application;
import de.namics.agutheil.example.config.ApplicationConfiguration;

@Configuration
public class HelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Application application = context.getBean("application", Application.class);
		application.print();
	}

}
