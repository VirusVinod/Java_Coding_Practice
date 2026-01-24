package codingpactice1;

public class RemoveSpecialCharactersFromString27 {
	public static void main(String[] args) {

		String str = "#$%^&*&^ERTYUYTRE$%^&^87654";
		String clean = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == ' ') {
				clean = clean + ch;
			}
		}
		System.out.println(clean);
	}

}
