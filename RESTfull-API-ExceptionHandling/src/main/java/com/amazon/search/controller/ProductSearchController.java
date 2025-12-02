package com.amazon.search.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.search.request.SearchRequest;
import com.amazon.search.service.ProductService;

@RestController
public class ProductSearchController {

	@Autowired
	ProductService productService;
	
	
	@GetMapping("searchProduct")
	public ResponseEntity searchProduct(@RequestBody SearchRequest searchRequest) {
		Map<String, Object> body = new HashMap();
		
		productService.findProductByString(searchRequest.getSearchString());
		
//		body.put("success", true);
//		body.put("message", "Products fetched successfully");
//		
//		Product product = new Product();
//		product.setCategory(searchRequest.getCategory());
//		product.setDescription("This is samsung product");
//		product.setId(1001L);
//		product.setName("samsung fold z7");
//		product.setPrice(99999);
//		
//		body.put("data", product);
		
		return ResponseEntity.ok(body);
	}
}
