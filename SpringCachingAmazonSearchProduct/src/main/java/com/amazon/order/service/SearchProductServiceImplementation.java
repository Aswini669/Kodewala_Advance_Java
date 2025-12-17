package com.amazon.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.amazon.order.entities.Product;
import com.amazon.order.repository.ProductRepository;

@Service
public class SearchProductServiceImplementation implements SearchProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Cacheable(value = "products-new", key = "#name", unless = "#result == null")
	@Override
	public Product searchProduct(String name) {
		System.out.println("Fetching from DB");
		
		return productRepository.findByName(name).orElseThrow(() -> new RuntimeException("Product not found"));
	}

}
