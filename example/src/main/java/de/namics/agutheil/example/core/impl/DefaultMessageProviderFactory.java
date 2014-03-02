package de.namics.agutheil.example.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.namics.agutheil.example.core.api.MessageProvider;
import de.namics.agutheil.example.core.api.MessageProviderFactory;

@Component("messageProviderFactory")
public class DefaultMessageProviderFactory implements MessageProviderFactory{
	
	private String message;
	@Autowired
	public DefaultMessageProviderFactory(String message) {
		super();
		this.message = message;
	}

	public MessageProvider createMessageProvider() {
		return new DefaultMessageProvider(message);
	}
}
