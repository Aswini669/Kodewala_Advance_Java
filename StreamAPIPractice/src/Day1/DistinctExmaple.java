package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExmaple {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,5,6,5,3,5,6);
		List<Integer> outPut = list.stream().distinct().collect(Collectors.toList());
		System.out.println(outPut);
	}
}
