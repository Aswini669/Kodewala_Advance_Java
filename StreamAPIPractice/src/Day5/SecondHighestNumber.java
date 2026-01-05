package Day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
	    Integer outPut = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	    System.out.println(outPut);
	}
}
