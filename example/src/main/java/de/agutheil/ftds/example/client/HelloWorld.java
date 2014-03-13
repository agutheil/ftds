package de.agutheil.ftds.example.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import de.agutheil.ftds.example.core.api.HelloWorldApplication;
import de.agutheil.ftds.example.core.impl.DefaultApplicationConfiguration;
import de.agutheil.ftds.example.core.spring.CoreApplicationConfiguration;

@Configuration
public class HelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CoreApplicationConfiguration.class, DefaultApplicationConfiguration.class, ApplicationConfiguration.class);
		HelloWorldApplication helloWorldApplication = context.getBean("helloWorldApplication",HelloWorldApplication.class);
		helloWorldApplication.print();
		
	}

}
