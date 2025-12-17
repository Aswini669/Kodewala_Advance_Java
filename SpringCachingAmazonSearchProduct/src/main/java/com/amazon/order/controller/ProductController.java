package com.amazon.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.order.entities.Product;
import com.amazon.order.service.SearchProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	SearchProductService searchProductService;

	@GetMapping("search")
	public Product productSearch(@RequestParam String name) {
		System.out.println("sending start time to API and action name");
		System.out.println("searching product");
		System.out.println("sending start time to API and action name");
		return searchProductService.searchProduct(name);
	}
}
