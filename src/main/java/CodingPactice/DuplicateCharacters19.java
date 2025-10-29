package CodingPactice;

public class DuplicateCharacters19 {

	public static void main(String[] args) {

		String str = "sssreffsdsddddddddddesssssass";
		String strup = str.toUpperCase();
		int[] count = new int[256];

		for (int i = 0; i < strup.length(); i++) {
			char ch = strup.charAt(i);
			count[ch]++;
		}
		for (int j = 0; j < 256; j++) {
			if (count[j] > 1) {
				System.out.println((char) j + " - " + count[j]);
			}

		}

	}

}
