package de.agutheil.ftds.example.core.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import de.agutheil.ftds.example.core.api.MessageProvider;
import de.agutheil.ftds.example.core.impl.DefaultPrinter;

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
