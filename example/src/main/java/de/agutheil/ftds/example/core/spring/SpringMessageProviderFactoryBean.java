package de.agutheil.ftds.example.core.spring;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.agutheil.ftds.example.core.api.MessageProvider;
import de.agutheil.ftds.example.core.api.MessageProviderFactory;
@Component("messageProvider")
public class SpringMessageProviderFactoryBean implements FactoryBean<MessageProvider>, InitializingBean{
	private MessageProvider messageProvider;
	
	private MessageProviderFactory messageProviderFactory;
	@Autowired
	public SpringMessageProviderFactoryBean(
			MessageProviderFactory messageProviderFactory) {
		super();
		this.messageProviderFactory = messageProviderFactory;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		messageProvider = messageProviderFactory.createMessageProvider();
	}

	@Override
	public MessageProvider getObject() throws Exception {
		return messageProvider;
	}

	@Override
	public Class<MessageProvider> getObjectType() {
		return MessageProvider.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
