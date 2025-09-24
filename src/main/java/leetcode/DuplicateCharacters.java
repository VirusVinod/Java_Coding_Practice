package leetcode;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str = "programming";

		int[] freq = new int[256];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch]++;
		}

		System.out.println("Duplicate characters:");

		for (int i = 0; i < 256; i++) {
			if (freq[i] > 1) {
				System.out.println((char) i + " - " + freq[i]);
			}
		}

	}

}
