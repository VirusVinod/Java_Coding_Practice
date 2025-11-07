package codingpactice1;

import java.util.Arrays;

public class areAnagrams {

	public static void main(String[] args) {
		String str1 = "laptop";
		String str2 = "toplap";

		boolean anagram = true;

		if (str1.length() != str2.length()) {
			anagram = false;
		} else {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (!Arrays.equals(ch1, ch2)) {
				anagram = false;
			}
		}
		if (anagram) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
