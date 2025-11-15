package codingpactice1;

public class SwapTwoString1 {

	public static void main(String[] args) {

		String a = "DATA";
		String b = "CABLE";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("A : " + a);
		System.out.println("B : " + b);
	}

}
