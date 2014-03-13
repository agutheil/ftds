package de.agutheil.ftds.example.helloworld;

public class DefaultMessageProvider implements MessageProvider {
	private String message;
	
	public DefaultMessageProvider(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
