package CodingPactice;

public class RemoveDuplicateString12 {

	public static void main(String[] args) {
		String str = "Happy new Year";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ' ') {
				res += ch;
			} else if (res.indexOf(ch) == -1) {
				res += ch;
			}
		}
		System.out.print(res);

	}

}
