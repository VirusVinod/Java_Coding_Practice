package CodingPactice;

public class Swapstr8 {

	public static void main(String[] args) {

		String a = "abc";
		String b = "xyz";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}

}
