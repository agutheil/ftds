package de.agutheil.ftds.example.beanwiring;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		CartService cartService = context.getBean("cartService", CartService.class);
		System.out.println(cartService.createCart());
		System.out.println(cartService.createCart());
		System.out.println(cartService.createCart());
	}

}
