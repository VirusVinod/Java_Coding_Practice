package leetcode;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String str = "vinodivnn";
		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (count[ch] == 1) {
				System.out.println(ch);
				return;
			}

		}
		System.out.println("No found");
	}

}
