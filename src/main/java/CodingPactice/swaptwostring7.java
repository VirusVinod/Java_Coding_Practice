package CodingPactice;

public class swaptwostring7 {
	public static void main(String[] args) {

		String a = "aaaa";
		String b = "bcbbc";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
