package com.publicapis.exceptionhandler;

public class EntryNotFoundException extends RuntimeException {

	public EntryNotFoundException() {

	}

	public EntryNotFoundException(String msg) {
		super(msg);
	}
}
