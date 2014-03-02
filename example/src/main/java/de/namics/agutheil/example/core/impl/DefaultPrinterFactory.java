package de.namics.agutheil.example.core.impl;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.namics.agutheil.example.core.api.Printer;
import de.namics.agutheil.example.core.api.PrinterFactory;

@Component("printerFactory")
public class DefaultPrinterFactory implements PrinterFactory{

	private PrintStream printStream = System.out;
	@Autowired
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
