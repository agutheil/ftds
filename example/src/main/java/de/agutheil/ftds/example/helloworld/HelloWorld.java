package de.agutheil.ftds.example.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.SimpleCommandLinePropertySource;

public class HelloWorld {

	public static void main(String[] args) {
		PropertySource ps = new SimpleCommandLinePropertySource(args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().getPropertySources().addFirst(ps);
		context.register(ApplicationConfiguration.class);
		context.refresh();
		
		MessagePrinter messagePrinter = context.getBean("messagePrinter",MessagePrinter.class);
		messagePrinter.printMessage();
	}


}
