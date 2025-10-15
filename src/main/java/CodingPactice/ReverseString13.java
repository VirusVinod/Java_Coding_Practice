package CodingPactice;

public class ReverseString13 {

	public static void main(String[] args) {

		String str = "BHJUIOOUF";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.print(res);
	}

}
