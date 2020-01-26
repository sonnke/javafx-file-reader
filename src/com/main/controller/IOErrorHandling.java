package com.main.controller;

import java.io.FileNotFoundException;

public class IOErrorHandling extends FileNotFoundException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IOErrorHandling() {
		super("Something went wrong!");
	}
	
	public IOErrorHandling(String message) {
		super(message);
	}

}
