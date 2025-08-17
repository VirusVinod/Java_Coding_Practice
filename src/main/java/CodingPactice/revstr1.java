package CodingPactice;

public class revstr1 {

	public static void main(String[] args) {
		String str = "india";
		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.print(rev);

	}

}
