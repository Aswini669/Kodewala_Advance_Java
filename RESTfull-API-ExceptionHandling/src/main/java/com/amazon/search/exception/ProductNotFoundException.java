package com.amazon.search.exception;

public class ProductNotFoundException extends RuntimeException{

	public ProductNotFoundException(String _message) {
		super(_message);
	}
}
