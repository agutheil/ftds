package de.agutheil.ftds.example.beanwiring;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class URLConnectionFactoryBean implements FactoryBean<URLConnection>, InitializingBean {
	
	private URL url;
	private URLConnection urlConnection;
	

	@Override
	public URLConnection getObject() throws Exception {
		return urlConnection;
	}

	@Override
	public Class<URLConnection> getObjectType() {
		return URLConnection.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		urlConnection = url.openConnection();
	}

	public void setUrl(URL url) {
		this.url = url;
	}
}
