package de.agutheil.ftds.example.solid.dip;

import java.util.HashMap;
import java.util.Map;

public class Repository {
	private KeyboardReader keyboardReader;
	private PrinterWriter printerWriter;
	private Map<String,Object> repo;

	public static Repository getInstance() {
		return new Repository();
	}
 
	public Repository() {
		super();
		keyboardReader = new KeyboardReader();
		printerWriter = new PrinterWriter();
		repo = new HashMap<String, Object>();
		repo.put("reader", keyboardReader);
		repo.put("writer", printerWriter);
	}

	public Object getProvider(String id){
		return repo.get(id);
	}

}
