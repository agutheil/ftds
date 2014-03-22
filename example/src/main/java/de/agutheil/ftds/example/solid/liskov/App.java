package de.agutheil.ftds.example.solid.liskov;

public class App {

	public static void main(String[] args) {
		Ellipse e = new Ellipse();
		Client client = new Client(e);
		client.tuEs(1, 2);
	}

}
