package de.namics.agutheil.example.impl;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="de.namics.agutheil.example.impl")
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
