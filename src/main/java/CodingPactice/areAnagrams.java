package CodingPactice;

import java.util.Arrays;

public class areAnagrams {

	public static void main(String[] args) {

		String s1 = "geeks";
		String s2 = "kseeg";

		boolean isAnagrams = true;

		if (s1.length() != s2.length()) {
			isAnagrams = false;
		} else {

			char[] s1array = s1.toCharArray();
			char[] s2array = s2.toCharArray();

			Arrays.sort(s1array);
			Arrays.sort(s2array);

			if (!Arrays.equals(s1array, s2array)) {
				isAnagrams = false;
			}
		}

		if (isAnagrams) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}
