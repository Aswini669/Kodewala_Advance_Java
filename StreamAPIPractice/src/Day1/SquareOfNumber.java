package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumber {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> outPut = nums.stream().map(n -> n*n).collect(Collectors.toList());
		System.out.println(outPut);
	}
}
