package de.agutheil.ftds.example.solid.dip;

public class CopyApplicationFactory {
	private KeyboardReader keyboardReader;
	private PrinterWriter printerWriter;
	private CopyDIP copy;
	public CopyApplicationFactory() {
		super();
		keyboardReader = new KeyboardReader();
		printerWriter = new PrinterWriter();
		copy = new CopyDIP(keyboardReader, printerWriter);
	}
	public CopyApplication getApplication(){
		return copy;
	}
}
