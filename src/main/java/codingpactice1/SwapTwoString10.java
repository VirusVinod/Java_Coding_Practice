package codingpactice1;

public class SwapTwoString10 {

	public static void main(String[] args) {

		String a = "abx";
		String b = "xyz";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("A : " + a);
		System.out.println("B : " + b);
	}

}
