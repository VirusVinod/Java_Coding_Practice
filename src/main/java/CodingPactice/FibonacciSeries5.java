package CodingPactice;

public class FibonacciSeries5 {

	public static void main(String[] args) {
		int n = 10, First = 0, second = 1;
		for (int i = 1; i < n; i++) {
			System.out.print(First + " ");

			int temp = First + second;
			First = second;
			second = temp;

		}

	}

}
