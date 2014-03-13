package de.agutheil.ftds.example.core.impl;

import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamMock extends PrintStream {
	private OutputStream outputStream;
	private boolean called = false;
	private String value;
	
	public OutputStream getOutputStream() {
		return outputStream;
	}

	public PrintStreamMock(OutputStream out) {
		super(out);
		outputStream = out;
	}

	
	public boolean isCalled() {
		return called;
	}

	public String getValue() {
		return value;
	}

	@Override
	public void println(String x) {
		called = true;
		value = x;
	}
}
