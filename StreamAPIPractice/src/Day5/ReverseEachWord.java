package Day5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		String sent = "I am from Odisha";
		String outPut = Arrays.stream(sent.split(" ")).map(w -> new StringBuilder(w).reverse().toString()).collect(Collectors.joining());
		System.out.println(outPut);
	}
}
