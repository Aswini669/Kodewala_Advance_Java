package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>(Arrays.asList("Hi","How Are ","u"));
		List<String> list2 = new ArrayList<String>(Arrays.asList("Aman","Kumar"));
		List<String> list3 = new ArrayList<String>(Arrays.asList("I am from klokata","and u"));
		
		List<List<String>> group = new ArrayList<List<String>>();
		group.add(list1);
		group.add(list2);
		group.add(list3);
		
		List<String> outPut = group.stream().flatMap(m -> m.stream()).map(l -> l.toUpperCase()).sorted().toList();
		System.out.println(outPut);
		
	}
}
