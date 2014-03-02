package de.namics.agutheil.example.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class DefaultMessageProviderTest {

	@Test
	public void testGetMessage() {
		String message = "test";
		DefaultMessageProvider messageProvider = new DefaultMessageProvider(message);
		assertEquals(message, messageProvider.getMessage());
	}
}
