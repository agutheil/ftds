package de.namics.agutheil.example.impl;

import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.api.PrinterFactory;

public class DefaultPrinterFactory implements PrinterFactory{
	public Printer createPrinter() {
		return new DefaultPrinter();
	}
}
