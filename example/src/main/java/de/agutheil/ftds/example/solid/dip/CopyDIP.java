package de.agutheil.ftds.example.solid.dip;

public class CopyDIP {
	private ReadableInput readableInput;
	private PrintableOutput printableOutput;
	
	public CopyDIP(ReadableInput readableInput, PrintableOutput printableOutput) {
		super();
		this.readableInput = readableInput;
		this.printableOutput = printableOutput;
	}
	
	public void readAndPrint(){
		printableOutput.write(readableInput.read());
	}

	
}
