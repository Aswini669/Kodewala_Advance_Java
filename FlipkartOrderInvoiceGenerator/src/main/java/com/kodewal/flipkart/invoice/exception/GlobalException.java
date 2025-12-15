package com.kodewal.flipkart.invoice.exception;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewal.flipkart.invoice.response.ErrorResponse;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity noSuchElementExceptionHandle(NoSuchElementException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrCode("FEI-5487");
		errorResponse.setErrMsg("Please Enter valid Id");
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(InvalidDataException.class)
	public ResponseEntity invalidDataExceptionHandle(InvalidDataException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrCode("FIE-87985");
		errorResponse.setErrMsg(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
	
	
}
