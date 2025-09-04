package CodingPactice;

public class ReverseStr9 {

	public static void main(String[] args) {
		String str = "MOBILE";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + " " + res;
		}
		System.out.print(res);

	}

}
