package Day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongeestString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abinash","Aswini","Nikhil","Dipankar","Soumya","yogesh");
		String longestWord = list.stream()
				.max(Comparator.comparingInt(String::length)) //s -> s.length()
				.orElse("");
		System.out.println("Longest word is: "+ longestWord);
	}
}
