package CodingPactice;

import java.util.LinkedHashSet;

public class RenoveDuplicateSrtring {

	public static void main(String[] args) {
		 String input = "programming";

	        String result = removeDuplicates(input);

	        System.out.println("Original String: " + input);
	        System.out.println("String after removing duplicates: " + result);
	    }

	    public static String removeDuplicates(String str) {
	        LinkedHashSet<Character> set = new LinkedHashSet<>();
	        for (char c : str.toCharArray()) {
	            set.add(c);
	        }

	        StringBuilder result = new StringBuilder();
	        for (char c : set) {
	            result.append(c);
	        }

	        return result.toString();

	}

}
