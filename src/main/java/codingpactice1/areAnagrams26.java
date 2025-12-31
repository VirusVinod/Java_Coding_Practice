package codingpactice1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class areAnagrams26 {

	public static void main(String[] args) {

		String str1 = "core";
		String str2 = "oecr";

		boolean isAnagram = true;

		if (str1.length() != str2.length()) {
			isAnagram = false;
		} else {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (!Arrays.equals(ch1, ch2)) {
				isAnagram = false;

			}
		}
		if (isAnagram) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
