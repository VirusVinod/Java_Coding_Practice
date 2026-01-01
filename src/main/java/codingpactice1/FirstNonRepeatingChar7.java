package codingpactice1;

public class FirstNonRepeatingChar7 {

	public static void main(String[] args) {

		String str = "copycpy";
		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}

		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if (count[ch] == 1) {
				System.out.println(ch);
				return;
			}
		}
		System.out.println("No Found");
	}

}
