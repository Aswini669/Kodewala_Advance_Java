package com.streamapi.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class CountExample {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("kodewala","BTM","Banglore");
		
		Long outPut = name.stream().filter(n -> n.startsWith("B")).count();
		
		System.out.println(outPut);
	}
}
