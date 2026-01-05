package Day3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestNonRepeaatingString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","ream","stream api","abc","abca","abcdef","helo","hey");
		
		String outPut = list.stream()
				.filter(a -> a.chars().distinct().count() == a.length())
				.max(Comparator.comparingInt(m -> m.length()))
				.get();
		
		System.out.println(outPut);
	}
}
