package CodingPactice;

import java.util.Arrays;

public class areAnagrams8 {

	public static void main(String[] args) {

		String str1 = "lapp";
		String str2 = "ppal";

		boolean isAnagarm = true;

		if (str1.length() != str2.length()) {
			isAnagarm = false;
		} else {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (!Arrays.equals(ch1, ch2)) {
				isAnagarm = false;
			}
		}
		if (isAnagarm) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
