package com.streamapi.classproblems;

public class FirstNonReaptingCharacter {

	public static void main(String[] args) {
		String mob = "samsung";
		
		Character outPut = mob.chars()
				.mapToObj(c -> (char)c)
				.filter(c -> mob.indexOf(c) == mob.lastIndexOf(c))
				.findFirst()
				.orElse(null);
		
		System.out.println(outPut);
	}
}
