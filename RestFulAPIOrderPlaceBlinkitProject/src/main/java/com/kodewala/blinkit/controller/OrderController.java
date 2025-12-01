package com.kodewala.blinkit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.blinkit.bean.OrderInfo;

@RestController
public class OrderController {

	@PostMapping("placeOrder")
	public ResponseEntity orderPlace(@RequestBody OrderInfo ordreInfo) {
		System.out.println("Product detaols: " + "Product Id: " + ordreInfo.getProdId()+" || " + "Product Name: " + ordreInfo.getProdName());
		return ResponseEntity.ok("Order Delivered"); //response back to client
	}
}

