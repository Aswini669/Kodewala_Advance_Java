package Day2;

import java.util.Arrays;
import java.util.List;

public class SplitExample {

	public static void main(String[] args) {
		List<List<String>> sentences = Arrays.asList(Arrays.asList("I am from kod"),
				Arrays.asList("You are fro dj"),
				Arrays.asList("nkcs ksnk","csns dkn"));
		
		List<String> outPut = sentences.stream().flatMap(n -> n.stream()).flatMap(n -> Arrays.stream(n.split(" "))).toList();
		System.out.println(outPut);
				
	}
}
