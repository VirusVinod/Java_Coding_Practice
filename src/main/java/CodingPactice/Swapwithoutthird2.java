package CodingPactice;

public class Swapwithoutthird2 {
	

	public static void main(String[] args) {
		String a = "Hii";
		String b = "World";


		a = a+b;
		b= a.substring(0, a.length()-b.length());
		a=a.substring(b.length());

		System.out.println(a);
		System.out.println(b);

	}


}
