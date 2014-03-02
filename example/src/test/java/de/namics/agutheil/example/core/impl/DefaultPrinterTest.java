package de.namics.agutheil.example.core.impl;

import static org.junit.Assert.*;


import org.junit.Test;

import de.namics.agutheil.example.core.api.MessageProvider;

public class DefaultPrinterTest {

	@Test
	public void test() {
		final String message = "Hello World Test";
		PrintStreamMock ps = new PrintStreamMock(System.out);
		DefaultPrinter printer = new DefaultPrinter(ps);
		printer.print(new MessageProvider() {
			
			@Override
			public String getMessage() {
				return message;
			}
		});
		assertEquals("PrintStreamMock bekommt nicht den erwarteten Wert von DefaultPrinter uebergeben.", message, ps.getValue());
	}

}
