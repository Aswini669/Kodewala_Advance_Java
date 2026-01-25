package com.kodewala.shop.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.kodewala.shop.response.ErrorResponse;

@RestControllerAdvice
public class ShopExceptionHandler {

	@ExceptionHandler(PaymentFailedException.class)
	public ResponseEntity<ErrorResponse> paymentFailedExceptionHandle(PaymentFailedException ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrCode("SH-897");
		errorResponse.setErrorMsg(ex.getMessage());
		return ResponseEntity.ok(errorResponse);
	}
}
