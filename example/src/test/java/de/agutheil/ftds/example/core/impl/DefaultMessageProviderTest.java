package de.agutheil.ftds.example.core.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import de.agutheil.ftds.example.core.impl.DefaultMessageProvider;

public class DefaultMessageProviderTest {

	@Test
	public void testGetMessage() {
		String message = "test";
		DefaultMessageProvider messageProvider = new DefaultMessageProvider(message);
		assertEquals(message, messageProvider.getMessage());
	}
}
