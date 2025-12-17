package com.hdfc.payment.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hdfc.payment.response.ErrorResponse;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(AccountNotFoundException.class)
	public ResponseEntity<ErrorResponse> accountNotFoundHandler(AccountNotFoundException ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrCode("ANE-1001");
		errorResponse.setErrMsg(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(DeActivateExcception.class)
	public ResponseEntity<ErrorResponse> deActivateExceptionHandler(DeActivateExcception ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrCode("DAE-1002");
		errorResponse.setErrMsg(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(InsufficientBalanceException.class)
	public ResponseEntity<ErrorResponse> insufficientBalanceException(InsufficientBalanceException ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrCode("INE-1003");
		errorResponse.setErrMsg(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
	
}
