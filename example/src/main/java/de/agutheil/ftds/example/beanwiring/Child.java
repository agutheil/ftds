package de.agutheil.ftds.example.beanwiring;

public class Child {

	public Child() {
		super();
		System.out.println(Child.class + " initialized");
	}
	
	public void sayHi() {
		System.out.println("Hi!");
	}
	
}
