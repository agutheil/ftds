package de.agutheil.ftds.example.core.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import de.agutheil.ftds.example.core.api.Printer;
import de.agutheil.ftds.example.core.impl.DefaultPrinter;
import de.agutheil.ftds.example.core.impl.DefaultPrinterFactory;

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
