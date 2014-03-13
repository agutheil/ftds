package de.agutheil.ftds.example.helloworld;

public interface MessagePrinter {	
	void setMessageProvider(MessageProvider messageProvider);
	void printMessage();
}
