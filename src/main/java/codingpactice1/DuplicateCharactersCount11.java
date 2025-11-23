package codingpactice1;

public class DuplicateCharactersCount11 {

	public static void main(String[] args) {

		String str = "VariableVaria";
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
