package com.streamapi.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapStringExample {

	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(Arrays.asList("Apple", "samsung", "nokia"),
				Arrays.asList("LG", "sansuie", "micromax", "loyard"),
				Arrays.asList("lenevo", "daikin", "oneplus", "ealme", "xiomi", "lava"));
		
		System.out.println("input: "+ list);
		
		List<String> outPut = list.stream().flatMap(l -> l.stream()).filter(a -> a.length() > 5).collect(Collectors.toList());
		System.out.println(outPut);

	}
}
