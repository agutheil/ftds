package de.namics.agutheil.example.impl;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.api.PrinterFactory;

@Component("printer")
public class DefaultPrinterFactory implements PrinterFactory, FactoryBean<Printer>, InitializingBean{
	private Printer printer;
	public Printer createPrinter() {
		return new DefaultPrinter();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		printer = new DefaultPrinter();
	}

	@Override
	public Printer getObject() throws Exception {
		return printer;
	}

	@Override
	public Class<?> getObjectType() {
		return Printer.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
