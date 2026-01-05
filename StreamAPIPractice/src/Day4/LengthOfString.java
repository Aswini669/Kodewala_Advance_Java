package Day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Aninash","Nikhil","Aswini","SoumyaDeep","Dipankar");
		List<Integer> outPut = list.stream().map(l -> l.length()).collect(Collectors.toList());
		System.out.println(outPut);
	}
}
