package com.kodewala.myntra.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.myntra.response.ErrorResponse;

@RestControllerAdvice
public class MyntraExceptionHandler {

	@ExceptionHandler(ProductionNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleException(ProductionNotFoundException ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(ex.getMessage());
		errorResponse.setMessageCode("MYN-001");
		return ResponseEntity.ok(errorResponse);
	}
}
