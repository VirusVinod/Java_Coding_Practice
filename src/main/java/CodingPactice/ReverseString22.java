package CodingPactice;

public class ReverseString22 {
	public static void main(String[] args) {

		String str = "AAAAsssssssseeeedsw";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.print(res.toUpperCase());
	}

}
