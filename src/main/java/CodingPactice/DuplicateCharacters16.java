package CodingPactice;

public class DuplicateCharacters16 {
	public static void main(String[] args) {

		String str = "DDDatatataahd";
		String orgstr = str.toLowerCase();
		int[] count = new int[256];

		for (int i = 0; i < orgstr.length(); i++) {
			char ch = orgstr.charAt(i);
			count[ch]++;
		}
		for (int j = 0; j < 256; j++) {
			if (count[j] > 1) {
				System.out.println((char) j + " - " + count[j]);
			}
		}
	}

}
