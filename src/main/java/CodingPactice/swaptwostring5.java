package CodingPactice;

public class swaptwostring5 {

	public static void main(String[] args) {

		String a = "A";
		String b = "B";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

}
