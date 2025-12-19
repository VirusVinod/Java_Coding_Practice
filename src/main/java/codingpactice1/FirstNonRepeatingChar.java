package codingpactice1;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String str = "systtsem";
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
		System.out.println("Not fount First non reparting ");
	}

}
