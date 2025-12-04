package com.kodewala.payment.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.payment.response.ErrorResponse;

@RestControllerAdvice
public class PaymentExceptionHandler {

	@ExceptionHandler(PaymentFailedException.class)
	public ResponseEntity exceptionHandle(PaymentFailedException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrMsg(ex.getMessage());
		errorResponse.setErrorCode("SW-1245X");
		return ResponseEntity.ok(errorResponse);
	}
}
