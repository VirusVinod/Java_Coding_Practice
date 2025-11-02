package leetcode;

import java.util.Arrays;

public class areAnagrams {

	public static void main(String[] args) {
		String s1 = "geeks";
		String s2 = "kseeg";

		boolean isAnagram = true;

		if (s1.length() != s2.length()) {
			isAnagram = false;
		} else {

			char[] s1Array = s1.toCharArray();
			char[] s2Array = s2.toCharArray();

			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

			if (!Arrays.equals(s1Array, s2Array)) {
				isAnagram = false;
			}

		}

		if (isAnagram) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
