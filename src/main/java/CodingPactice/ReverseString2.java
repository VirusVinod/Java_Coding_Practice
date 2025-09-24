package CodingPactice;

public class ReverseString2 {

	public static void main(String[] args) {

		String str = "adbc";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.println(res.toUpperCase());

	}

}
