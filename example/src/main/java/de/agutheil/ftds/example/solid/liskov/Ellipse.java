package de.agutheil.ftds.example.solid.liskov;

public class Ellipse {
	int x;
	int y;
	public void setScale(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getScaleX() {
		return x;
	}
	
	public int getScaleY() {
		return y;
	}

}
