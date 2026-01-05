package Day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergedString {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A","B","C");
		List<String> list2 = Arrays.asList("A","Y","Z");
		
		List<String> merge = Stream.concat(list1.stream(), list2.stream()).distinct().toList();
		System.out.println(merge);
	}
}
