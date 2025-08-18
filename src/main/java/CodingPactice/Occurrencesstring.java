package CodingPactice;

public class Occurrencesstring {

	public static void main(String[] args) {

		String org = "programmingprogramming";
		int[] count = new int[256];

		for (int i = 0; i < org.length(); i++) {
			count[org.charAt(i)]++;
		}

		for (int j = 0; j < 256; j++) {
			if (count[j] > 1) {
				System.out.println((char) j + " : " + count[j]);

			}
		}

	}

}
