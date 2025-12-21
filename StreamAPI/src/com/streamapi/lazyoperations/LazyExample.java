package com.streamapi.lazyoperations;

import java.util.Arrays;
import java.util.List;

public class LazyExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Banglore","BTM","Bombay");
		
		list.stream().filter(n -> {
			System.out.println("Filtering: "+ n);
			return n.startsWith("B");
		}).map(m -> {
			System.out.println("Mapping: "+ m);
			return m.toUpperCase();
		}).forEach(System.out::println);
	}
}
