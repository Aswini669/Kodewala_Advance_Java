package Day5;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToCollectionExampe {

	public static void main(String[] args) {
		LinkedList<String> linkedList = Stream.of("A","B","C","D")
				.collect(Collectors.toCollection(() -> new LinkedList<String>()));
		System.out.println(linkedList);
	}
}
