package CodingPactice;

public class Reverseint1 {

	public static void main(String[] args) {
		String str = "Hello";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + " " + res;
		}
		System.out.print(res);

	}

}
