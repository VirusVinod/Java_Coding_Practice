package interview;

public class TextTransform {

	public static void main(String[] args) {
		String input = "python is cool";
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'o') {
				output.append('0');
			} else if (ch == 'i') {
				output.append('1');
			} else if (ch == 's') {
				output.append('5');
			} else {
				output.append(ch);
			}
		}
		System.out.println(output.toString()); // pyth0n 15 c00l

	}

}
