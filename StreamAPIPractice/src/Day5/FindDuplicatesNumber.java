package Day5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,1,5,3);
		Set<Integer> duplicate = list.stream()
				.filter(n -> Collections.frequency(list, n) > 1)
				.collect(Collectors.toSet());
		System.out.println("duplicates are: " + duplicate);
	}
}
