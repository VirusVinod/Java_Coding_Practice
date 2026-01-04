package codingpactice1;

public class DuplicateCharactersCount29 {

	public static void main(String[] args) {

		String str1 = "IUYTREWERTYUIOPOIUYTRASSDDD";
		int[] count = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			count[ch]++;
		}

		for (int j = 0; j < 256; j++) {
			if (count[j] > 1) {
				System.out.println((char) j + " - " + count[j]);
			}
		}
	}

}
