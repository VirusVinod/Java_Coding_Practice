package CodingPactice;

public class FibonacciSeries4 {

	public static void main(String[] args) {
		int n = 10, first = 0, second = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print(first + ",");

			int temp = first + second;
			first = second;
			second = temp;
		}

	}

}
