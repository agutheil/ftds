package de.namics.agutheil.example.impl;

import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamMock extends PrintStream {
	public PrintStreamMock(OutputStream out) {
		super(out);
	}

	private boolean called = false;
	private String value;
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
