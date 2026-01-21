package codingpactice1;

public class FirstNonRepeatingChar12 {

	public static void main(String[] args) {

		String str1 = "classlass";
		int[] count = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			count[ch]++;
		}
		for (int j = 0; j < str1.length(); j++) {
			char ch = str1.charAt(j);
			if (count[ch] == 1) {
				System.out.print(ch);
				return;
			}
		}
		System.out.println("No found");
	}

}
