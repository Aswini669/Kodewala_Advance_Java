package com.kodewala.myntra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.myntra.bean.ProductBean;
import com.kodewala.myntra.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("addProduct")
	public ResponseEntity addProduct(@RequestBody ProductBean productBean) {
		System.out.println("product details: " + productBean.getItmName());
		productService.addProduct(productBean);
		return ResponseEntity.ok("Recieved");
	}
}
