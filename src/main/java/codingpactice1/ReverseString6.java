package codingpactice1;

public class ReverseString6 {
	public static void main(String[] args) {

		String str = "COMP";
		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.println(rev);
	}

}
