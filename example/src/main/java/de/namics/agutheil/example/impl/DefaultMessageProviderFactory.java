package de.namics.agutheil.example.impl;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import de.namics.agutheil.example.api.MessageProvider;
import de.namics.agutheil.example.api.MessageProviderFactory;

@Component("messageProvider")
public class DefaultMessageProviderFactory implements MessageProviderFactory, FactoryBean<MessageProvider>, InitializingBean{
	private String message = "default Message";
	private MessageProvider messageProvider;
	
	@Autowired
	public DefaultMessageProviderFactory(@Value("Hello World")String message) {
		super();
		this.message = message;
	}

	@Override
	public MessageProvider createMessageProvider() {
		return messageProvider;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		messageProvider = new DefaultMessageProvider(message);
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
