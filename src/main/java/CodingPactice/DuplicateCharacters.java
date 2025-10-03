package CodingPactice;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String str = "Programming";
		int[] res = new int[256];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			res[ch]++;
		}

		for (int j = 0; j < 256; j++) {
			if (res[j] > 1) {
				System.out.println((char) j + " - " + res[j]);
			}

		}

	}

}
