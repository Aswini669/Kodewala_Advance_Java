package Day5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionByExample {

	public static void main(String[] args) {
		Map<Boolean, List<Integer>> partitioned = Stream.of(1,2,3,4,5,6,7,8,9).collect(Collectors.partitioningBy(n -> n%2 == 0));
		System.out.println(partitioned);
	}
}
