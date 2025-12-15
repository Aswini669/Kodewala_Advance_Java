package com.kodewal.amazon.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewal.amazon.order.bean.OrderBean;
import com.kodewal.amazon.order.bean.UpdateOrderBean;
import com.kodewal.amazon.order.entities.OrderEntity;
import com.kodewal.amazon.order.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@PostMapping("createOrder")
	public String createOrder(@RequestBody OrderBean orderBean) {
		System.out.println("Order description: " + orderBean.getDescription());
		int ordId = orderService.createOrder(orderBean);
		return "Your Product Order Id : " + ordId;
	}
	
	@PutMapping("/order/{orderId}/status")
	public String updateStatus(@PathVariable int orderId,@RequestBody UpdateOrderBean updateOrderEntity) {
		OrderEntity result = orderService.updateNewStatus(orderId, updateOrderEntity);
		return "Yur orders are updated: " + result.getOrderName();
	}
}
