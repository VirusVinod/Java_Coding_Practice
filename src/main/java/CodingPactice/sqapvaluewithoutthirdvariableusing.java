package CodingPactice;

public class sqapvaluewithoutthirdvariableusing {

	public static void main(String[] args) {

		int a=10;
		int b= 20;

		System.out.println("before a ____: " +a);
		System.out.println("before b ____: " +b);


		a =a+b;
		b=a-b;
		a=a-b;

		System.out.println("after a : " +a);
		System.out.println("after b : " +b);


	}

}
