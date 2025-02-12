package InterviewQes;

public class RenoveDuplicateSrtring2 {
	public static void main(String[] args) {
		String input = "automation";

		String result = removeDuplicates(input);

		System.out.println("Original String: " + input);
		System.out.println("String after removing duplicates: " + result);
	}

	public static String removeDuplicates(String str) {
		boolean[] seen = new boolean[256]; 
		StringBuilder result = new StringBuilder(str.length());

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!seen[c]) {
				seen[c] = true;
				result.append(c);
			}
		}

		return result.toString();
	}

}
