package leetcode;

public class OccurrencesString {

	public static void main(String[] args) {
		String str = "AaaaaaaaUtomatiiiiionn";
		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[Character.toLowerCase(str.charAt(i))]++;
//			count[str.charAt(i)]++;
		}

		for (int j = 0; j < 256; j++) {
			if (count[j] >= 1) {
				System.out.println((char) j + " : " + count[j]);
			}
		}

	}

}
