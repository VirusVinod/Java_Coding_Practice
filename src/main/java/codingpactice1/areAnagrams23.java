package codingpactice1;

import java.util.Arrays;

public class areAnagrams23 {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "bca";

		boolean isAnagrams = true;

		if (str1.length() != str2.length()) {
			isAnagrams = false;
		} else {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (!Arrays.equals(ch1, ch2)) {
				isAnagrams = false;
			}
		}
		if (isAnagrams) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
