package com.kodewala.myntra.version.exception;

public class PaymentFailedException extends RuntimeException{

	public PaymentFailedException(String message) {
		super(message);
	}
}
