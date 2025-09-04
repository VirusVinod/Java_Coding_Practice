package CodingPactice;

public class Reversestr3 {

	public static void main(String[] args) {

		String str = "story";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + " " + res;
		}
		System.out.println(res);

	}

}
