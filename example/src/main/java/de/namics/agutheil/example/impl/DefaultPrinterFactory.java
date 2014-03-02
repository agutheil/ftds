package de.namics.agutheil.example.impl;

import java.io.PrintStream;

import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.api.PrinterFactory;

public class DefaultPrinterFactory implements PrinterFactory{
	PrintStream printStream = System.out;
	
	public void setPrintStream(PrintStream printStream) {
		this.printStream = printStream;
	}
	public DefaultPrinterFactory(PrintStream printStream) {
		super();
		this.printStream = printStream;
	}
	public DefaultPrinterFactory() {
		super();
	}
	public Printer createPrinter() {
		return new DefaultPrinter(printStream);
	}
}
