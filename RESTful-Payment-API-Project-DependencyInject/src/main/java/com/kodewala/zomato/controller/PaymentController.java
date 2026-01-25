package com.kodewala.zomato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodewala.zomato.request.PaymentRequest;
import com.kodewala.zomato.service.PaymentService;

@Controller
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;

	@PostMapping("payments")
	@ResponseBody
	public ResponseEntity confirmPayment(@RequestBody PaymentRequest request) {
		paymentService.pay(request);
		return ResponseEntity.ok("Payment Success");
	}
}
