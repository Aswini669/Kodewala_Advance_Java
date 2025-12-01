package com.kodewala.myntra.exception;

public class ProductionNotFoundException extends RuntimeException{

	public ProductionNotFoundException(String _message) {
		super(_message);
	}
}
