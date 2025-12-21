package com.streamapi.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class MinExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,5,20);
		
		Integer minValue = list.stream().min((a,b) -> a-b).get();
		
		System.out.println(minValue);
	}
}
