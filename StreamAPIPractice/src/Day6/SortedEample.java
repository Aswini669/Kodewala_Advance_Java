package Day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,69,35,14,57,31,16,24,13);
		List<Integer> outPut = list.stream().sorted().collect(Collectors.toList());
		System.out.println(outPut);
	}
}
