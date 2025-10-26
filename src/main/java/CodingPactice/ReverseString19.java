package CodingPactice;

public class ReverseString19 {

	public static void main(String[] args) {

		String str = "AABBCCG2G1G";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.println(res);
	}

}
