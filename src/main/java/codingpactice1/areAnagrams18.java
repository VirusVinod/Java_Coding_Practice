package codingpactice1;

import java.util.Arrays;

public class areAnagrams18 {

	public static void main(String[] args) {

		String str1 = "back";
		String str2 = "kcba";

		boolean isAnagaram = true;

		if (str1.length() != str2.length()) {
			isAnagaram = false;
		} else {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (!Arrays.equals(ch1, ch2)) {
				isAnagaram = false;
			}
		}
		if (isAnagaram) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
