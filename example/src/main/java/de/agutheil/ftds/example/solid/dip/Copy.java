package de.agutheil.ftds.example.solid.dip;

public class Copy {
	private KeyboardReader keyboardReader;
	private PrinterWriter printerWriter;
	
	public Copy(KeyboardReader keyboardReader, PrinterWriter printerWriter) {
		super();
		this.keyboardReader = keyboardReader;
		this.printerWriter = printerWriter;
	}
	
	public void readAndPrint(){
		printerWriter.write(keyboardReader.read());
	}
}
