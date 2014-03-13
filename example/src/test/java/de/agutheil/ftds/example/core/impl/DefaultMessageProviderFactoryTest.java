package de.agutheil.ftds.example.core.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import de.agutheil.ftds.example.core.api.MessageProvider;
import de.agutheil.ftds.example.core.impl.DefaultMessageProviderFactory;

public class DefaultMessageProviderFactoryTest {

	@Test
	public void test() {
		String message = "Hallo Welt";
		DefaultMessageProviderFactory factory = new DefaultMessageProviderFactory(message);
		assertEquals(message, factory.createMessageProvider().getMessage());
	}

}
