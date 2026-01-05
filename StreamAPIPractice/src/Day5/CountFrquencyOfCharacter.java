package Day5;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFrquencyOfCharacter {

	public static void main(String[] args) {
		String fruit = "Pinnaple";
		Map<Character, Long> freq = fruit.chars() //convert string into IntStream
				.mapToObj(c -> (char)c)           // each integer value into character
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(freq);
	}
}
