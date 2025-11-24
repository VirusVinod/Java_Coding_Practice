package codingpactice1;

import java.util.Arrays;

public class areAnagrams11 {
	public static void main(String[] args) {

		String str1 = "Listen".toLowerCase();
		String str2 = "SiLent".toLowerCase();

		boolean isdup = true;

		if (str1.length() != str2.length()) {
			isdup = false;
		} else {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (!Arrays.equals(ch1, ch2)) {
				isdup = false;
			}

		}
		if (isdup) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
