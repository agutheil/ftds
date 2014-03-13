package de.agutheil.ftds.example.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		if(args.length < 1){
			System.err.println("Keine Nachricht uebergeben!");
			System.exit(1);
		}
		
		Message message = new Message(args[0]);
		
		MessageProvider messageProvider = messageProvider(message);
		MessagePrinter messagePrinter = messagePrinter(messageProvider);
		messagePrinter.printMessage();

	}

	private static MessagePrinter messagePrinter(MessageProvider messageProvider) {
		// TODO Auto-generated method stub
		return null;
	}

	private static MessageProvider messageProvider(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

}
