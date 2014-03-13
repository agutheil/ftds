package de.agutheil.ftds.example.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		if(args.length < 1){
			System.err.println("Keine Nachricht uebergeben!");
			System.exit(1);
		}
		String message = args[0];
		System.out.println(message);

	}

}
