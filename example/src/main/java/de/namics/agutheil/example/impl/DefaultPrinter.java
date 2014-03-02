package de.namics.agutheil.example.impl;

import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.Printer;

class DefaultPrinter implements Printer {

	public void print(MessageProvider messageProvider) {
		System.out.println(messageProvider.getMessage().toUpperCase());
	}

}
