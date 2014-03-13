package de.agutheil.ftds.example.core.impl;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.agutheil.ftds.example.core.api.Printer;
import de.agutheil.ftds.example.core.api.PrinterFactory;

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
