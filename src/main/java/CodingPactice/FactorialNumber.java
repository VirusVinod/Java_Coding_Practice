package CodingPactice;

public class FactorialNumber {

	public static int Factorial(int num) {
		int fact = 1;
		int i;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;

	}

	public static void main(String[] args) {
		System.out.println(Factorial(4));
	}

}
