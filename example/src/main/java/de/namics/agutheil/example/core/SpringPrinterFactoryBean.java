package de.namics.agutheil.example.core;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import de.namics.agutheil.example.api.Printer;
import de.namics.agutheil.example.api.PrinterFactory;

public class SpringPrinterFactoryBean implements FactoryBean<Printer>, InitializingBean {

	private PrinterFactory printerFactory;
	private Printer printer;
	
	public SpringPrinterFactoryBean(PrinterFactory printerFactory) {
		super();
		this.printerFactory = printerFactory;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		printer = printerFactory.createPrinter();
	}

	@Override
	public Printer getObject() throws Exception {
		return printer;
	}

	@Override
	public Class<Printer> getObjectType() {
		return Printer.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
