package codingpactice1;

public class SwapTwoString8 {

	public static void main(String[] args) {

		String a = "lapp";
		String b = "Acvc";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
