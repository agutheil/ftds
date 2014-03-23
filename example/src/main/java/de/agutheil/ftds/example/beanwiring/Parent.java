package de.agutheil.ftds.example.beanwiring;

public class Parent {
	private Child child;

	public Parent() {
		super();
		System.out.println(Parent.class + " initialized");
	}

	public void setChild(Child child) {
		this.child = child;
	}
	
	public void askChildToSayHi(){
		child.sayHi();
	}
}
