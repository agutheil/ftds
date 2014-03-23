package de.agutheil.ftds.example.beanwiring;

import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

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
	
	@Bean 
	Circle yellowCircle(){
		Circle circle = circle();
		circle.setColor(Color.YELLOW);
		return circle;
	}
	
	@Bean 
	Circle blueCircle(){
		Circle circle = circle();
		circle.setColor(Color.BLUE);
		return circle;
	}
	
	Circle circle(){
		Circle circle = new Circle();
		circle.setRadius(15);
		return circle;
	}
	
}
