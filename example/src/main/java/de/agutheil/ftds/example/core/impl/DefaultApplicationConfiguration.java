package de.agutheil.ftds.example.core.impl;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="de.namics.agutheil.example.core.impl")
public class DefaultApplicationConfiguration {
	@Bean
	String message(){
		return "Default";
	}
	
	@Bean 
	PrintStream printStream(){
		return System.out;
	}
}
