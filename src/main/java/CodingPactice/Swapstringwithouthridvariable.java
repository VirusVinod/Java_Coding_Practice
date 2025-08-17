package CodingPactice;

public class Swapstringwithouthridvariable {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "India";

		System.out.println("before a : " + a);
		System.out.println("before b : " + b);
		System.out.println("----------------------");


		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("after a : " + a);
		System.out.println("after b : " + b);

	}

}
