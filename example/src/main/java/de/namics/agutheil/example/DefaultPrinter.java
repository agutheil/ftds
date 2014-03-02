package de.namics.agutheil.example;

public class DefaultPrinter implements Printer {

	public void print(MessageProvider messageProvider) {
		System.out.println(messageProvider.getMessage());
	}

}
