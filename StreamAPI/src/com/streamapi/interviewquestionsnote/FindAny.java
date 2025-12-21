package com.streamapi.interviewquestionsnote;

import java.util.Arrays;
import java.util.List;

public class FindAny {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aman", "Soumya", "Yogesh", "Aakash");
		
		String outPut = names.parallelStream()
				.filter(m -> m.startsWith("A"))
				.findAny()
				.get();
		
		System.out.println(outPut);
	}
}
