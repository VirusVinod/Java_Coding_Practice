package CodingPactice;

public class occurancestr {

	public static void main(String[] args) {
		String st = "Automationnnnna";
		int[] count = new int[256];

		for (int i = 0; i < st.length(); i++) {
			count[st.charAt(i)]++;
		}

		for (int j = 0; j < 256; j++) {
			if (count[j] > 1) {
				System.out.println((char) j + ":" + count[j]);
			}
		}

	}

}
