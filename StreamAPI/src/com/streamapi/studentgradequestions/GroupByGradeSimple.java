package com.streamapi.studentgradequestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGradeSimple {

	public static void main(String[] args) {
		List<Students> students = Arrays.asList(
                new Students("Alice", "A"),
                new Students("Bob", "B"),
                new Students("Charlie", "A"),
                new Students("David", "C"),
                new Students("Eve", "B")
        );
		
		Map<String, List<String>> studentbyGrade = students.stream()
		.collect(Collectors.groupingBy(
				s -> s.getGrade(),
				Collectors.mapping(s -> s.getName(), Collectors.toList())));
		
		System.out.println(studentbyGrade);
	}
}
