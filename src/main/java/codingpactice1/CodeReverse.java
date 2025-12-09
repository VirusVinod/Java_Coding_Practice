package codingpactice1;

public class CodeReverse {
	public static void main(String[] args) {
		String str = "Hello Word";
		String rev = "";
		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != ' ') {
				temp = ch + temp; 
			} else {
				rev += temp + " ";
				temp = ""; 
			}
		}

		rev += temp;

		System.out.println(rev);
	}

}
