package de.agutheil.ftds.example.beanwiring;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		MyService myURLConnectionService = context.getBean("myURLConnectionService", MyService.class);
		System.err.println(myURLConnectionService);
		// tu was
	}

}
