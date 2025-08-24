package CodingPactice;

public class ReverseStr2 {

	public static void main(String[] args) {

		String str = "world";
		String res = "";
		System.out.println(" before reverse : " + str);

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + " " + res;
		}
		System.out.println(" after reverse : " + res);
	}

}
