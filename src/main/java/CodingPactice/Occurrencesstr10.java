package CodingPactice;

public class Occurrencesstr10 {

	public static void main(String[] args) {

		String str = "VinodVinod";
		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		for (int j = 0; j < 256; j++) {
			if (count[j] >= 1) {
				System.out.println((char) j + " : " + count[j]);
			}
		}
	}

}
