package com.streamapi.notes;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,1,4,6,7,8,9);
		
		list.stream().filter(n -> n%2==0)
		.map(n -> n*10).
		forEach(n -> System.out.println(n));
	}
}
