package com.amazon.search.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.amazon.search.response.ErrorResponse;

@RestControllerAdvice
public class AmazonExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorResponse> hadleException(ProductNotFoundException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(ex.getMessage());
		errorResponse.setMessageCode("AM-2541C");
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> hadleException(Exception ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(ex.getMessage());
		errorResponse.setMessageCode("AM-2542C");
		return ResponseEntity.ok(errorResponse);
	}
}
