package CodingPactice;

public class ReverseString27 {

	public static void main(String[] args) {

		String str = "AVINKOA";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.print(res);
	}

}
