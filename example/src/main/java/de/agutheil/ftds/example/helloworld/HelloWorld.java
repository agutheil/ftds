package de.agutheil.ftds.example.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {

	public static void main(String[] args) {
		if(args.length < 1){
			System.err.println("Keine Nachricht uebergeben!");
			System.exit(1);
		}
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		MessageProvider messageProvider = context.getBean("messageProvider",MessageProvider.class);
		MessagePrinter messagePrinter = context.getBean("messagePrinter",MessagePrinter.class);
		messagePrinter.printMessage();
	}


}
