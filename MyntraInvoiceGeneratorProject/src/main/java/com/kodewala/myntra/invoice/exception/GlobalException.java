package com.kodewala.myntra.invoice.exception;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.myntra.invoice.response.ErrorResponse;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity noSuchEleExceptionHandle(NoSuchElementException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrCode("MYN-9866");
		errorResponse.setErrMsg("Please Enter Unique Id");
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(NoIndexOutOfBoundException.class)
	public ResponseEntity indexOutOfBoundExceptionHanlde(NoIndexOutOfBoundException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrCode("IND-6542");
		errorResponse.setErrMsg(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
		
	}
}
