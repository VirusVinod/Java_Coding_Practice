package CodingPactice;

public class Reversestr13 {

	public static void main(String[] args) {
		String str = "Hello";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + " " + res;
		}
		System.out.println(res);
	}

}
