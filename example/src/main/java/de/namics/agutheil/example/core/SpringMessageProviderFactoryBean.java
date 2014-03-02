package de.namics.agutheil.example.core;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.MessageProviderFactory;
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
