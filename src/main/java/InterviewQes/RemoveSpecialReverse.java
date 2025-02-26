package InterviewQes;

public class RemoveSpecialReverse {

	public static void main(String[] args) {
		String input = "se$^%lenum is go&^*od";

		String cleanedString = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetterOrDigit(ch) || ch == ' ') { // Allow letters, digits, and spaces
				cleanedString += ch;
			}
		}

		// Step 2: Reverse the cleaned string using a for loop
		String reversedString = "";
		for (int i = cleanedString.length() - 1; i >= 0; i--) {
			reversedString += cleanedString.charAt(i);
		}

		// Print results
		System.out.println("Original String: " + input);
		System.out.println("Cleaned String: " + cleanedString);
		System.out.println("Reversed String: " + reversedString);

	}

}
