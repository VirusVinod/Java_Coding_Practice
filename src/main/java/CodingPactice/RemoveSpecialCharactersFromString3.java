package CodingPactice;

public class RemoveSpecialCharactersFromString3 {

	public static void main(String[] args) {

		String str = "Lapt#$%^&*()!!!op";
		String claen = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == ' ') {
				claen = claen + ch;
			}
		}
		System.out.println(claen);
	}

}
