package CodingPactice;

import java.util.Arrays;

public class areAnagrams1 {

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "lleho";

		boolean areAnagrams = true;

		if (str1.length() != str2.length()) {
			areAnagrams = false;
		} else {

			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (!Arrays.equals(ch1, ch2)) {
				areAnagrams = false;
			}
		}

		if (areAnagrams) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
	}

}
