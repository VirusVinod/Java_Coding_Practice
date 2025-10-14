package CodingPactice;

public class ReverseString12 {
	public static void main(String[] args) {

		String str = "acfghttt";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.print(res.toUpperCase());
	}
}
