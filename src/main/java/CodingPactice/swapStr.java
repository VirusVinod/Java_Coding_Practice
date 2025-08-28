package CodingPactice;

public class swapStr {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "world";

		System.out.println("before a : " + a);
		System.out.println("before b : " + b);

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("after a : " + a);
		System.out.println("after b : " + b);

	}

}
