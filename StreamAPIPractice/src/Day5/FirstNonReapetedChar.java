package Day5;

public class FirstNonReapetedChar {

	public static void main(String[] args) {
		String input = "Nikhil";
		Character firstNonRepeat = input.chars()
				.mapToObj(c -> (char)c)
				.filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
				.findFirst()
				.orElse(null);
		System.out.println("First non-repeated: "+ firstNonRepeat);
	}
}
