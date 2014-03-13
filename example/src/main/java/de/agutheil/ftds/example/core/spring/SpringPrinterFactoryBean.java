package de.agutheil.ftds.example.core.spring;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.agutheil.ftds.example.core.api.Printer;
import de.agutheil.ftds.example.core.api.PrinterFactory;
@Component("printer")
public class SpringPrinterFactoryBean implements FactoryBean<Printer>, InitializingBean {
	private Printer printer;
	
	private PrinterFactory printerFactory;
	
	@Autowired
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