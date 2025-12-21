package com.streamapi.interviewquestionsnote;

import java.util.Arrays;
import java.util.List;

public class LazyExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Aman","Soumya","Yogesh","Aakash");
		
		list.stream().filter(n ->{
			System.out.println("filtered name: "+ n);
			return n.startsWith("A");
		})
		.map(m -> {
			System.out.println("mapping: "+ m);
			return m.toUpperCase();
		})
		.forEach(System.out::println);
	}
}
