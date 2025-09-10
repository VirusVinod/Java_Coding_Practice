package CodingPactice;

public class Reversestr12 {

	public static void main(String[] args) {
		String str = "HI";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + " " + res;
		}
		System.out.print(res);
	}

}
