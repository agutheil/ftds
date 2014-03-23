package de.agutheil.ftds.example.beanwiring;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		Parent parent = context.getBean("parent", Parent.class);
		System.out.println("Now getting child ...");
		Child child = context.getBean("child", Child.class);
		parent.setChild(child);
		parent.askChildToSayHi();
	}

}
