package com.kodewal.amazon.order.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewal.amazon.order.response.ErrorResponse;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(InvalidDataException.class)
	public ResponseEntity invalidDataExceptionHandle(InvalidDataException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrCode("AME-65845");
		errorResponse.setErrMessage(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
}
