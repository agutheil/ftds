package de.namics.agutheil.example;

import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.MessageProviderFactory;
import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.api.PrinterFactory;
import de.namics.agutheil.example.impl.DefaultMessageProviderFactory;
import de.namics.agutheil.example.impl.DefaultPrinterFactory;

public class HelloWorld {

	public static void main(String[] args) {
		MessageProviderFactory messageProviderFactory = new DefaultMessageProviderFactory("Hello World");
		MessageProvider messageProvider = messageProviderFactory.createMessageProvider();
		PrinterFactory printerFactory = new DefaultPrinterFactory();
		Printer printer = printerFactory.createPrinter();
		printer.print(messageProvider);
	}

}
