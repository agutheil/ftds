package de.namics.agutheil.example.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.namics.agutheil.example.api.Application;
import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.Printer;

@Component("application")
public class DefaultApplication implements Application{
	@Autowired
	private Printer printer;

	@Autowired
	private MessageProvider messageProvider;
	
	@Override
	public void print(){
		printer.print(messageProvider);
	}
	

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

}
