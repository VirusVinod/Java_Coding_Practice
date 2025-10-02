package CodingPactice;

public class ReverseString6 {
	public static void main(String[] args) {

		String str = "LAPTOP";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;

		}

		System.out.print(res);
	}

}
