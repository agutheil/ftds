package de.agutheil.ftds.example.core.impl;

import de.agutheil.ftds.example.core.api.HelloWorldApplication;
import de.agutheil.ftds.example.core.api.MessageProvider;
import de.agutheil.ftds.example.core.api.Printer;

class DefaultHelloWorldApplication implements HelloWorldApplication {
	private Printer printer;
	
	private MessageProvider messageProvider;
	
	public DefaultHelloWorldApplication(Printer printer,
			MessageProvider messageProvider) {
		super();
		this.printer = printer;
		this.messageProvider = messageProvider;
	}


	@Override
	public void print() {
		printer.print(messageProvider);
	}

}
