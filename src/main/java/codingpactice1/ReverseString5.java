package codingpactice1;

public class ReverseString5 {

	public static void main(String[] args) {

		String str = "COMP";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.println(res);
	}

}
