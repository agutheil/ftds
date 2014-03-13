package de.agutheil.ftds.example.core.impl;

import de.agutheil.ftds.example.core.api.MessageProvider;

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
