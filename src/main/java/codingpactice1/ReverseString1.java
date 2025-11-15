package codingpactice1;

public class ReverseString1 {

	public static void main(String[] args) {

		String str = "VINODKR";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.println(res);
	}

}
