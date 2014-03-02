package de.namics.agutheil.example.impl;

import de.namics.agutheil.example.api.MessageProvider;

public class DefaultMessageProvider implements MessageProvider {
	private String message;
	
	public DefaultMessageProvider(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
