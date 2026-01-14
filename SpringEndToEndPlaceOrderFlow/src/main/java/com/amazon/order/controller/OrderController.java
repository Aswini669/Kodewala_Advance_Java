package com.amazon.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amazon.order.bean.OrderBean;
import com.amazon.order.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping("showOrder")
	public String showOrderPage() {
		System.out.println("show the order page");
		return "orderPage";
	}
	
	@PostMapping("placeOrder")
	public String placeOrder(@ModelAttribute OrderBean order, Model model) {
		System.out.println("places order are: ");
		System.out.println("order controller,item name: " + order.getItemName());
		int orderId = orderService.createOrder(order);
		model.addAttribute("orderId", orderId);
		return "orderSuccess";
	}
}
