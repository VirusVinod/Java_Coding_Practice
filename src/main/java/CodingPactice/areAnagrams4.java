package CodingPactice;

import java.util.Arrays;

public class areAnagrams4 {

	public static void main(String[] args) {

		String str1 = "name";
		String str2 = "mena";

		boolean anagaram = true;

		if (str1.length() != str2.length()) {
			anagaram = false;
		} else {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (!Arrays.equals(ch1, ch2)) {
				anagaram = false;
			}
		}

		if (anagaram) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
