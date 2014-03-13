package de.agutheil.ftds.example.helloworld;

import java.io.PrintStream;

public class DefaultMessagePrinter implements MessagePrinter {
	private PrintStream output;

	private MessageProvider messageProvider;
	
	@Override
	public void printMessage() {
		output.println(messageProvider.getMessage());

	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
	
	public void setOutput(PrintStream output) {
		this.output = output;
	}

}
