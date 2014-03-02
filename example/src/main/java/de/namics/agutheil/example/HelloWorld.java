package de.namics.agutheil.example;

import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.impl.DefaultMessageProvider;
import de.namics.agutheil.example.impl.DefaultPrinter;

public class HelloWorld {

	public static void main(String[] args) {
		MessageProvider messageProvider = new DefaultMessageProvider("Hello World");
		Printer printer = new DefaultPrinter();
		printer.print(messageProvider);
	}

}
