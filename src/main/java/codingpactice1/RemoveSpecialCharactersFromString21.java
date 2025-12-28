package codingpactice1;

public class RemoveSpecialCharactersFromString21 {

	public static void main(String[] args) {

		String str = "#$%^&*(VBINO*&^FH*9";
		String clecn = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == ' ') {
				clecn = clecn + ch;
			}
		}
		System.out.println(clecn);
	}

}
