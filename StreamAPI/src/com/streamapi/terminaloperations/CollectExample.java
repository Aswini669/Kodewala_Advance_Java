package com.streamapi.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Banglore","BTM","Kodewala");
		
		List<String> outPut = list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(outPut);
	}
}
