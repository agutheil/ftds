package de.namics.agutheil.example.core.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import de.namics.agutheil.example.core.api.MessageProvider;

public class DefaultMessageProviderFactoryTest {

	@Test
	public void test() {
		String message = "Hallo Welt";
		DefaultMessageProviderFactory factory = new DefaultMessageProviderFactory(message);
		assertEquals(message, factory.createMessageProvider().getMessage());
	}

}
