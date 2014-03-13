package de.agutheil.ftds.example.core.impl;

import java.io.PrintStream;

import de.agutheil.ftds.example.core.api.MessageProvider;
import de.agutheil.ftds.example.core.api.Printer;

class DefaultPrinter implements Printer {

	private PrintStream output;
	
	public DefaultPrinter(PrintStream output) {
		super();
		this.output = output;
	}
	public void print(MessageProvider messageProvider) {
		output.println(messageProvider.getMessage());
	}
	
	PrintStream getOutput() {
		return output;
	}

}
