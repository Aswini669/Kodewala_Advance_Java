package com.kodewala.swiggy.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodewala.swiggy.order.bean.OrderInfo;
import com.kodewala.swiggy.order.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping("orderPage")
	public String showOrderPage() {
		System.out.println("Show Order Page...");
		return "orderPage";
	}
	
	@PostMapping("placeOrder")
	public String placeOrder(@ModelAttribute OrderInfo order, Model model) {
		System.out.println("Order happened...");
		System.out.println("Order Controller:  Order Product Name: " + order.getProdName());
		int orderId = orderService.createOrdre(order);
		model.addAttribute("orderId", orderId);
		return "orderSuccess";
	}
}
