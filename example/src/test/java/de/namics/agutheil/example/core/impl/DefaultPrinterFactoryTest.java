package de.namics.agutheil.example.core.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import de.namics.agutheil.example.core.api.Printer;

public class DefaultPrinterFactoryTest {

	@Test
	public void testCreatePrinterForDefaultConstructor() {
		DefaultPrinterFactory factory = new DefaultPrinterFactory();
		assertEquals(System.out,((DefaultPrinter)factory.createPrinter()).getOutput());
	}	
	
	@Test
	public void testCreatePrinterForFullConstructor() {
		PrintStreamMock mock = new PrintStreamMock(System.out);
		DefaultPrinterFactory factory = new DefaultPrinterFactory(mock);
		assertEquals(mock,((DefaultPrinter)factory.createPrinter()).getOutput());
	}

}
