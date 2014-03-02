package de.namics.agutheil.example;

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
