package com.kodewala.myntra.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.myntra.bean.OrderInput;

@RestController
public class OrderController {

	@PostMapping("placeOrder")
	public ResponseEntity placeOrder(@RequestBody OrderInput orderInput) {
		
		System.out.println("Order details: " + orderInput.getItemName() + "Product ID: " + orderInput.getProductId());
		return ResponseEntity.ok("Order Recieved");  //response back to client
		
	}
}
