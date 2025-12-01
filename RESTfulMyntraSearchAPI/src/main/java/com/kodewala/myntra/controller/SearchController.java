package com.kodewala.myntra.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.myntra.entities.Product;
import com.kodewala.myntra.request.SearchRequest;
import com.kodewala.myntra.service.ProductService;

@RestController
public class SearchController {

	@Autowired
	ProductService productService;
	
	@GetMapping("searchProduct")
	public ResponseEntity searchProduct(@RequestBody SearchRequest searchRequest) {
		System.out.println(searchRequest.getProductName());
		List<Product> list= new ArrayList<Product>();
		
		list = productService.searchProductService(searchRequest.getProductName());
		
		return ResponseEntity.ok(list); 
	}
	
	
}
