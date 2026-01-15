package codingpactice1;

public class FirstNonRepeatingChar11 {

	public static void main(String[] args) {

		String str = "insertinert";
		int[] count = new int[256];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count[ch]++;
		}
		for (int j = 0; j < str.charAt(j); j++) {
			char ch = str.charAt(j);
			if (count[ch] == 1) {
				System.out.print(ch);
				return;
			}
		}
		System.out.println("No Found");
	}

}
