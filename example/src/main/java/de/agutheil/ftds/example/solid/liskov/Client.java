package de.agutheil.ftds.example.solid.liskov;

public class Client {
	Ellipse ellipse;
	public void tuEs(int x, int y) {
		ellipse.setScale(x, y);
		assert(ellipse.getScaleX() == x);
		assert(ellipse.getScaleY() == y);
	}
	public Client(Ellipse ellipse) {
		super();
		this.ellipse = ellipse;
	}

}
