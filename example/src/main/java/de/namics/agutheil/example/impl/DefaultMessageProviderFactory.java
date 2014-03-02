package de.namics.agutheil.example.impl;

import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.MessageProviderFactory;

public class DefaultMessageProviderFactory implements MessageProviderFactory{
	private String message;
	public DefaultMessageProviderFactory(String message) {
		super();
		this.message = message;
	}

	public MessageProvider createMessageProvider() {
		return new DefaultMessageProvider(message);
	}
}
