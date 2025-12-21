package com.streamapi.countexample;

import java.util.Arrays;
import java.util.List;

public class CountUniqueProduct {

	public static void main(String[] args) {
		List<String> products = Arrays.asList("LG", "Sony", "Motorola", "Micromax", "Vivo", "Oppo", "Realme");
		
		System.out.println("input: "+ products);
		
		 long uniqueProduct = products.stream().distinct().count();
		 System.out.println("total unique product: "+ uniqueProduct);
	}
}
