package de.namics.agutheil.example.core.impl;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DefaultMessageProviderTest.class, DefaultPrinterTest.class, DefaultMessageProviderFactoryTest.class, DefaultPrinterFactoryTest.class })
public class AllTests {

}
