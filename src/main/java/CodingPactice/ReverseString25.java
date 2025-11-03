package CodingPactice;

public class ReverseString25 {

	public static void main(String[] args) {

		String str = "1234";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.println(res);
	}

}
