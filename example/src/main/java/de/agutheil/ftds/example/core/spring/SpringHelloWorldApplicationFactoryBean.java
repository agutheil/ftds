package de.agutheil.ftds.example.core.spring;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.agutheil.ftds.example.core.api.HelloWorldApplication;
import de.agutheil.ftds.example.core.api.HelloWorldApplicationFactory;
@Component("helloWorldApplication")
public class SpringHelloWorldApplicationFactoryBean implements FactoryBean<HelloWorldApplication>, InitializingBean{

	private HelloWorldApplication helloWorldApplication;
	
	private HelloWorldApplicationFactory helloWorldApplicationFactory;
	
	@Autowired
	public SpringHelloWorldApplicationFactoryBean(
			HelloWorldApplicationFactory helloWorldApplicationFactory) {
		super();
		this.helloWorldApplicationFactory = helloWorldApplicationFactory;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		helloWorldApplication = helloWorldApplicationFactory.createHelloWorldApplication();
	}

	@Override
	public HelloWorldApplication getObject() throws Exception {
		return helloWorldApplication;
	}

	@Override
	public Class<HelloWorldApplication> getObjectType() {
		return HelloWorldApplication.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
