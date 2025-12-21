package com.streamapi.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class ToArrayExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("kodewala","Banglore","btm");
		
		String[] outPut = list.stream().toArray(s -> new String[s]);
		
		System.out.println(Arrays.toString(outPut));
	}
}
