package de.agutheil.ftds.example.solid.dip;

public class Copy {
	private KeyboardReader keyboardReader;
	private PrinterWriter printerWriter;
	
	public Copy() {
		super();
		this.keyboardReader = new KeyboardReader();
		this.printerWriter = new PrinterWriter();
	}
	
	public void readAndPrint(){
		printerWriter.write(keyboardReader.read());
	}
}
