package com.kodewala.myntra.version.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.myntra.version.response.ErrorResponse;

@RestControllerAdvice
public class MyntraExceptionHandle {

	@ExceptionHandler(PaymentFailedException.class)
	public ResponseEntity<ErrorResponse> handlePaymentFaiiledException(PaymentFailedException ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrCode("MYN-2456M");
		errorResponse.setErrorMessage(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
}
