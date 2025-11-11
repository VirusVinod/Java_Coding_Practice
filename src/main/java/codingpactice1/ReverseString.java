package codingpactice1;

public class ReverseString {

	public static void main(String[] args) {

		String str = "data";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.println(res.toUpperCase());
	}

}
