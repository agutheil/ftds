package de.agutheil.ftds.example.solid.ocp;

public class Client {
	Geom geom;
	public void draw() {
		if (geom.getType().equals("Kreis")){
			drawKreis();
		} else if (geom.getType().equals("Ellipse")){
			drawEllipse();
		}
	}
	private void drawEllipse() {
		// spaeter
	}
	private void drawKreis() {
		// spater
	}

}
