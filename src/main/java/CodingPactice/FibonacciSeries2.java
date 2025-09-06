package CodingPactice;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		int n = 10, fisrt = 0, second = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print(fisrt + ",");

			int temp = fisrt + second;
			fisrt = second;
			second = temp;

		}

	}

}
