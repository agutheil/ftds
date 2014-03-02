package de.namics.agutheil.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import de.namics.agutheil.example.core.api.HelloWorldApplication;
import de.namics.agutheil.example.core.spring.CoreApplicationConfiguration;
import de.namics.agutheil.example.core.impl.DefaultApplicationConfiguration;

@Configuration
public class HelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CoreApplicationConfiguration.class, DefaultApplicationConfiguration.class, ApplicationConfiguration.class);
		HelloWorldApplication helloWorldApplication = context.getBean("helloWorldApplication",HelloWorldApplication.class);
		helloWorldApplication.print();
		
	}

}
