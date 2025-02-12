package InterviewQes;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String A = scanner.nextLine();
		scanner.close();

		if (isPalindrome(A)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean isPalindrome(String str) {
		int length = str.length();
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
