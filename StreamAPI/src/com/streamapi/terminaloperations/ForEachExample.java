package com.streamapi.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Banglore","Kodewala","BTM");
		
		list .stream().forEach(s -> System.out.println(s));
	}
}
