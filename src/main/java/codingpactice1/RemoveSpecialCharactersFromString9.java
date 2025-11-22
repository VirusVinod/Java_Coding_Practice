package codingpactice1;

public class RemoveSpecialCharactersFromString9 {
	public static void main(String[] args) {

		String str = "$%^&*()He$%^llo";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == ' ') {
				res = res + ch;
			}
		}
		System.out.println(res);
	}

}
