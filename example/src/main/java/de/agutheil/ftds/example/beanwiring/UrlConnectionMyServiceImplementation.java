package de.agutheil.ftds.example.beanwiring;

import java.net.URLConnection;

public class UrlConnectionMyServiceImplementation implements MyService {
	private URLConnection urlConnection;

	public UrlConnectionMyServiceImplementation(URLConnection urlConnection) {
		super();
		this.urlConnection = urlConnection;
	}
	
}
