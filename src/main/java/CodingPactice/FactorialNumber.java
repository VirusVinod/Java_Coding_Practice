package CodingPactice;

public class FactorialNumber {

	public static int Factorial(int num) {
		int fact = 1;
		int i;
		if (num == 0)
			return 1;

		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	// with recursive function: a function is calling it self
	public static int fact(int num) {
		if (num == 0)
			return 1;
		else
			return (num * fact(num - 1));
	}

	public static void main(String[] args) {
		System.out.println(Factorial(4));
		System.out.println(Factorial(1));
		System.out.println(Factorial(0));
		System.out.println(fact(3));

	}

}
