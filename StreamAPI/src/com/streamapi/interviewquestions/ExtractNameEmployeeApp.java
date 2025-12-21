package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExtractNameEmployeeApp {

	public static void main(String[] args) {
		List<ExtractNameEmployee> list = Arrays.asList(new ExtractNameEmployee("Kunal", 13),
				new ExtractNameEmployee("Yogesh", 24), new ExtractNameEmployee("Aswini", 23),
				new ExtractNameEmployee("Nikhil", 28), new ExtractNameEmployee("Soumya", 22));
		
		Stream<ExtractNameEmployee> stream = list.stream();
		List<String> outPut = stream.map(e -> e.getName()).collect(Collectors.toList());
		
		System.out.println("name: "+ outPut);
	}
}
