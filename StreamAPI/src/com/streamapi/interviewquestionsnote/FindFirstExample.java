package com.streamapi.interviewquestionsnote;

import java.util.Arrays;
import java.util.List;

public class FindFirstExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aman", "Soumya", "Yogesh", "Aakash");
		
		String outPut = names.stream().filter(n -> n.startsWith("A")).findFirst().get();
		
		System.out.println(outPut);
	}
}
