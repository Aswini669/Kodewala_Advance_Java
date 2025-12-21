package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateString {

	public static void main(String[] args) {
		List<String> state = Arrays.asList("odisha","up","chennai","up","kolkata","uk");
		
		Set<String> seen = new HashSet<String>();
		
		List<String> duplicateState = state.stream().filter(n -> !seen.add(n)).toList();
		
		System.out.println("duplicate state string is: "+ duplicateState);
	}
}
