package com.kodewala.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.order.bean.OrderInfo;

@RestController
public class OrderController {

	@PostMapping("orderProcess")
	public ResponseEntity orderProcess(@RequestBody OrderInfo orderInfo) {
		System.out.println("Item Name: " + orderInfo.getItemName());
		return ResponseEntity.ok("Order recived...");
	}
}
