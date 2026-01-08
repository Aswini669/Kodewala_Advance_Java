package com.myntra.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myntra.order.request.OrderRequest;
import com.myntra.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("placeOrder")
	public String placeOrder(@RequestBody OrderRequest orderRequest) {
		int msg = orderService.placeOrder(orderRequest);
		return "successfully placed" + msg;
	}
}
