package de.agutheil.ftds.example.beanwiring;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		
		Circle yellowCircle = context.getBean("yellowCircle", Circle.class);
		Circle blueCircle = context.getBean("blueCircle", Circle.class);
		
		System.out.println(yellowCircle);
		System.out.println(blueCircle);
		
	}

}
