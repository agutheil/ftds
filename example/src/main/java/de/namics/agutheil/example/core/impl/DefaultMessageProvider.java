package de.namics.agutheil.example.core.impl;

import de.namics.agutheil.example.core.api.MessageProvider;

class DefaultMessageProvider implements MessageProvider {
	private String message;
	
	public DefaultMessageProvider(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
