package Day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SmallestString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abinash","Aswini","Nikhil","Dipankar","Soumya","yogesh");
		String outPut = list.stream().min(Comparator.comparingInt(String::length)).orElse("");

		System.out.println("smallest name is: " + outPut);
	}
}
