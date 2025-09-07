package CodingPactice;

public class Reversestr10 {

	public static void main(String[] args) {
		String str = "insert";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + " " + res;

		}
		System.out.print(res);

	}

}
