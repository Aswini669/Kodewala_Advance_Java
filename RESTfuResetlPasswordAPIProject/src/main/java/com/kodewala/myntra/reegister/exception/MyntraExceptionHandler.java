package com.kodewala.myntra.reegister.exception;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.myntra.response.ErrorResponse;

@RestControllerAdvice
public class MyntraExceptionHandler {

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<ErrorResponse> duplicateEmailRegisterExceptionHandler(ConstraintViolationException ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("REH-245D");
		errorResponse.setErrMsg("Email is Already Exist..Try another email");
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(DuplicateException.class)
	public ResponseEntity<ErrorResponse> handlePasswordAlreadyExistException(DuplicateException ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("PHE-541P");
		errorResponse.setErrMsg(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
	
	
	@ExceptionHandler(EmailNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleEmailNotFoundException(EmailNotFoundException ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("EEM-501X");
		errorResponse.setErrMsg(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
	
}
