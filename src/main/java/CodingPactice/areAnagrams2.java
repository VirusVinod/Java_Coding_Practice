package CodingPactice;

import java.util.Arrays;

public class areAnagrams2 {
	public static void main(String[] args) {

		String str1 = "geeks";
		String str2 = "eekgs";

		boolean isanagram = true;

		if (str1.length() != str2.length()) {
			isanagram = false;
		} else {

			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (!Arrays.equals(ch1, ch2)) {
				isanagram = false;
			}
		}

		if (isanagram) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
