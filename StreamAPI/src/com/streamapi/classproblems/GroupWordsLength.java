package com.streamapi.classproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bhubaneswar", "Berhumpur", "Cuttack", "Bhadrak", "Myurbhanj", "Bls", "Ctc");

		Map<Object, List<String>> lenWords = list.stream()
				.collect(Collectors.groupingBy(n -> n.length()));

		System.out.println(lenWords);

	}
}
