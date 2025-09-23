package leetcode;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {

		 String s = "babad";
	        if (s == null || s.length() < 2) {
	            System.out.println(s);
	            return;
	        }

	        int n = s.length();
	        int start = 0, maxLen = 1;

	        for (int i = 0; i < n; i++) {
	            // Odd length palindrome
	            int l = i, r = i;
	            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
	                if (r - l + 1 > maxLen) {
	                    start = l;
	                    maxLen = r - l + 1;
	                }
	                l--; r++;
	            }

	            // Even length palindrome
	            l = i; r = i + 1;
	            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
	                if (r - l + 1 > maxLen) {
	                    start = l;
	                    maxLen = r - l + 1;
	                }
	                l--; r++;
	            }
	        }

	        System.out.println("Input: " + s);
	        System.out.println("Longest Palindromic Substring: " + s.substring(start, start + maxLen));

	}

}
