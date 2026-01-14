package com.kodewala.zepto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.zepto.request.OrderRequest;

@RestController
public class OrderController {

	@PostMapping("placeOrder")
	public ResponseEntity placeOrder(@RequestBody OrderRequest orderRequest) {
		System.out.println("order details: " + orderRequest.getItemName() + " " + orderRequest.getProdId());
		
		return ResponseEntity.ok("order recieved");
	}
}
