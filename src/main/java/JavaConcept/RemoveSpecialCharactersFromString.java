package JavaConcept;

public class RemoveSpecialCharactersFromString {

	public static void main(String[] args) {

		String str = "D&^^iwa(((li";
		String clean = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == ' ') {
				clean = clean + ch;

			}
		}
		System.out.println(clean.toString());
	}

}
