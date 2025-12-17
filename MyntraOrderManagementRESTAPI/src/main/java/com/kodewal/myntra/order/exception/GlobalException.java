package com.kodewal.myntra.order.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewal.myntra.order.response.ErrorResponse;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity orderNotFoundExceptionHandle(OrderNotFoundException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrCode("MYE-231N");
		errorResponse.setErrMsg(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
}
