package Day2;

import java.util.Arrays;
import java.util.List;

public class SplitSentence {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("I from sky","You are from earth","Hey I, am aswini");
		
		List<String> outPut = list.stream().flatMap(n -> Arrays.stream(n.split(" "))).toList();
		System.out.println(outPut);
	}
}
