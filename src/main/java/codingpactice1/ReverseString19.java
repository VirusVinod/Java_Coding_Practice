package codingpactice1;

public class ReverseString19 {
	public static void main(String[] args) {

		String str = "vinoddd";
		String res = "";

		for (int i = 0; i < str.length(); i++) {

			res = str.charAt(i) + res;

		}
		System.out.print(res);
	}

}
