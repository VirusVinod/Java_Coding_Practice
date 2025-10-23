package CodingPactice;

public class ReverseString17 {
	public static void main(String[] args) {

		String dtr = "code";
		String res = "";

		for (int i = 0; i < dtr.length(); i++) {
			res = dtr.charAt(i) + res;
		}
		System.err.println(res.toUpperCase());
	}

}
