package de.agutheil.ftds.example.solid.liskov;

public class KreisApp {

	public static void main(String[] args) {
		Kreis k = new Kreis();
		Client client = new Client(k);
		client.tuEs(1, 2);
	}

}
