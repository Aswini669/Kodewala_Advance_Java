package Day5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByString {

	public static void main(String[] args) {
		List<String> word = Arrays.asList("one","three","five","four","six");
		Map<Integer, List<String>> outPut = word.stream().collect(Collectors.groupingBy(a -> a.length()));
		System.out.println(outPut);
	}
}
