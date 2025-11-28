package com.kodewala.myntra.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodewala.myntra.order.bean.OrderInfo;
import com.kodewala.myntra.order.services.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping("orderPage")
	public String showOrderPage() {
		System.out.println("Showing Order Pagge...");
		return "order";
	}
	
	@PostMapping("placeOrder")
	public String placeOrder(@ModelAttribute OrderInfo order, Model model) {
		System.out.println("Order Placed");
		System.out.println("Order Controller: Item Name: " + order.getItemName());
		int orderId = orderService.createOrder(order);
		model.addAttribute("orderId", orderId);
		return "orderSuccess";
	}
}
