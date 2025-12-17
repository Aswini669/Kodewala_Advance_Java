package com.kodewal.myntra.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewal.myntra.order.bean.OrderBean;
import com.kodewal.myntra.order.bean.UpdateStatusBean;
import com.kodewal.myntra.order.request.OrderRequest;
import com.kodewal.myntra.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("placeOrder")
	public String placeOrder(@RequestBody OrderBean orderBean) {
		System.out.println("Order Description is: " + orderBean.getDescription());
		int orderId = orderService.placeOrder(orderBean);
		return "Order Id : " + orderId;
	}
	
	@PutMapping("/order/{ordId}/status")
	public String updateStatus(@PathVariable int ordId,@RequestBody UpdateStatusBean updateBean) {
		OrderRequest result = orderService.updateOrderStatus(ordId, updateBean);
		return "Your Status has Update " + result.getOrdId();
	}
}
