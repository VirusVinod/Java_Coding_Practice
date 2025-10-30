package CodingPactice;

public class DuplicateCharacters20 {

	public static void main(String[] args) {
		String str = "ABHCCCVVVADSA";
		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}
		for (int j = 0; j < 256; j++) {
			if (count[j] > 1) {
				System.out.println((char) j + " - " + count[j]);
			}
		}

	}

}
