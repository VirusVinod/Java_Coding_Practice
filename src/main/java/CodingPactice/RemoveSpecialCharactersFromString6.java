package CodingPactice;

public class RemoveSpecialCharactersFromString6 {

	public static void main(String[] args) {
		String str = "32864643$%^&LAPPA";
		String clean = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == ' ') {
				clean = clean + ch;
			}

		}
		System.out.print(clean);

	}

}
