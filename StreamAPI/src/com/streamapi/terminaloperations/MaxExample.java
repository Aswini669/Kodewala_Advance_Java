package com.streamapi.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class MaxExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,5,20);
		
		Integer maxValue = list.stream().max((a,b) -> a-b).get();
		
		System.out.println(maxValue);
	}
}
