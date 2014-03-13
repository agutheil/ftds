package de.agutheil.ftds.example.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		if(args.length < 1){
			System.err.println("Keine Nachricht uebergeben!");
			System.exit(1);
		}
		
		String message = args[0];
		
		MessageProvider messageProvider = messageProvider(message);
		MessagePrinter messagePrinter = messagePrinter(messageProvider);
		messagePrinter.printMessage();
	}

	private static MessagePrinter messagePrinter(MessageProvider messageProvider) {
		DefaultMessagePrinter printer = new DefaultMessagePrinter();
		printer.setMessageProvider(messageProvider);
		printer.setOutput(System.out);
		return printer;
	}

	private static MessageProvider messageProvider(String message) {
		DefaultMessageProvider provider = new DefaultMessageProvider(message);
		return provider;
	}

}
