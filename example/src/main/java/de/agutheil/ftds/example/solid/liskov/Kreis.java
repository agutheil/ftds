package de.agutheil.ftds.example.solid.liskov;

public class Kreis extends Ellipse {
	@Override
	public void setScale(int x, int y) {
		this.x = x;	
		this.y = x;
	}
}
