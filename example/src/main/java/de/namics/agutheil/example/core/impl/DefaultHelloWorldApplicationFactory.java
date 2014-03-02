package de.namics.agutheil.example.core.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.namics.agutheil.example.core.api.HelloWorldApplication;
import de.namics.agutheil.example.core.api.HelloWorldApplicationFactory;
import de.namics.agutheil.example.core.api.MessageProvider;
import de.namics.agutheil.example.core.api.Printer;

@Component("helloWorldApplicationFactory")
public class DefaultHelloWorldApplicationFactory implements
		HelloWorldApplicationFactory {
	private Printer printer;
	
	private MessageProvider messageProvider;

	@Autowired
	public DefaultHelloWorldApplicationFactory(Printer printer,
			MessageProvider messageProvider) {
		super();
		this.printer = printer;
		this.messageProvider = messageProvider;
	}

	@Override
	public HelloWorldApplication createHelloWorldApplication() {
		return new DefaultHelloWorldApplication(printer, messageProvider);
	}

}
