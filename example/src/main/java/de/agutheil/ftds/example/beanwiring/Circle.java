package de.agutheil.ftds.example.beanwiring;

import java.awt.Color;

public class Circle {
	private Color color;
	private int radius;
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [color=" + color + ", radius=" + radius + "]";
	}

}
