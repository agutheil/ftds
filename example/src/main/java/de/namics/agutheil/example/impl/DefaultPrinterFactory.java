package de.namics.agutheil.example.impl;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.api.PrinterFactory;

@Component("printerFactory")
public class DefaultPrinterFactory implements PrinterFactory{
	@Autowired
	private PrintStream printStream = System.out;
	
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
