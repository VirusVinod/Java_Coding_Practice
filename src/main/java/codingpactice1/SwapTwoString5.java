package codingpactice1;

public class SwapTwoString5 {
	public static void main(String[] args) {

		String a = "DATA";
		String b = "SCI";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
