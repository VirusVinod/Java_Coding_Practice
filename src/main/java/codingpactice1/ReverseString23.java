package codingpactice1;

public class ReverseString23 {

	public static void main(String[] args) {

		String str = "tatasky";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.print(res);
	}

}
