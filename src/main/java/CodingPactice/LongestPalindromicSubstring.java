package CodingPactice;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {

		String s = "abcacaabcd";

		if (s == null || s.length() < 2) {
			return;

		}

		int n = s.length();
		int start = 0, maxlen = 1;

		for (int i = 0; i < n; i++) {

			int left = i, right = i;
			while (left >= 1 && right < n && s.charAt(left) == s.charAt(right)) {
				if (right - left + 1 > maxlen) {
					start = left;
					maxlen = right - left + 1;
				}
				left--;
				right++;

			}

			left = i;
			right = i + 1;
			while (left >= 1 && right < n && s.charAt(left) == s.charAt(right)) {
				if (right - left + 1 > maxlen) {
					start = left;
					maxlen = right - left + 1;
				}
				left--;
				right++;

			}

		}
		System.out.println("Input: " + s);
		System.out.println("Longest Palindromic Substring: " + s.substring(start, start + maxlen));

	}

}
