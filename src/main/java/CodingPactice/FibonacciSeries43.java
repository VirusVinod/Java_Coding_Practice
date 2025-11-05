package CodingPactice;

public class FibonacciSeries43 {
	public static void main(String[] args) {

		int n = 10, First = 0, Second = 1;

		for (int i = 1; i < n; i++) {
			System.out.print(First + ",");

			int nextdigit = First + Second;
			First = Second;
			Second = nextdigit;
		}

	}

}
