package com.streamapi.classproblems;

public class FirstNonReaptingChar {

	public static void main(String[] args) {
		String name = "neikhil";
		
		Character repeat = name.chars()
				.mapToObj(c -> (char)c)
				.filter(c -> name.indexOf(c) == name.lastIndexOf(c))
				.findFirst()
				.orElse(null);
		
//		Character repeat = name.chars().mapToObj(c -> (char)c).filter(c -> name.indexOf(c) == name.lastIndexOf(c)).skip(1).findFirst().orElse(null);
		
		System.out.println(repeat);
	}
}
