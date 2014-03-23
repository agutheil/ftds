package de.agutheil.ftds.example.beanwiring;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	@Bean
	MyService myService() {
		return new MyServiceImplementation();
	}
	
	@Bean 
	MessageDigest messageDigest() throws NoSuchAlgorithmException {
		return MessageDigest.getInstance("SHA-256");
	}
	
	@Bean
	MyService myURLConnectionService(URLConnection urlConnection) {
		return new UrlConnectionMyServiceImplementation(urlConnection);
	}
	
	@Bean
	URLConnectionFactoryBean urlConnection(URL hsrmUrl) {
		URLConnectionFactoryBean ucfb = new URLConnectionFactoryBean();
		ucfb.setUrl(hsrmUrl);
		return ucfb;
	}
	
	@Bean
	URL hsrmUrl() throws MalformedURLException{
		return new URL("http://www.hs-rm.de");
	}
	
	
	
}
