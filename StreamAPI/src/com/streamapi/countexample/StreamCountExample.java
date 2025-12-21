package com.streamapi.countexample;

import java.util.Arrays;
import java.util.List;

public class StreamCountExample {

	public static void main(String[] args) {
		List<String> products = Arrays.asList("Apple", "Samsung", "Nokia", "OnePlus", "Apple");
		
		System.out.println("input: "+ products);
		
		long totalProducts = products.stream().count();
		System.out.println("total product is: "+ totalProducts);
		
	}
}
