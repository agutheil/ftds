package de.agutheil.ftds.example.solid.dip;

public class LookUpCopy {
	
	private ReadableInput readableInput;
	private PrintableOutput printableOutput;
	private Repository repository;
	public LookUpCopy() {
		super();
		repository = Repository.getInstance();
		this.readableInput = (ReadableInput) repository.getProvider("reader");
		this.printableOutput = (PrintableOutput) repository.getProvider("printer");
	} 
	
	public void readAndPrint(){
		printableOutput.write(readableInput.read());
	}

	
}
