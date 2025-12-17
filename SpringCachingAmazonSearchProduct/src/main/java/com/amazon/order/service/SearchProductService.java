package com.amazon.order.service;

import org.springframework.stereotype.Service;

import com.amazon.order.entities.Product;

@Service
public interface SearchProductService {

	Product searchProduct(String name);
}
