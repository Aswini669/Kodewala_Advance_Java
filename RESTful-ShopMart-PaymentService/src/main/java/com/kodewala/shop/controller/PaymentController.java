package com.kodewala.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodewala.shop.request.PaymentRequest;
import com.kodewala.shop.service.PaymentService;

@Controller
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	
	@PostMapping("/confirmPayment")
	@ResponseBody
	public ResponseEntity confirmPayment(@RequestBody PaymentRequest request) {
		System.out.println("paymentRef no: " + request.getPaymentRefNo() + " " + request.getAmount());
		int paymentId = paymentService.pay(request);
		return ResponseEntity.ok("Payment Success: " + paymentId);
	}
}
