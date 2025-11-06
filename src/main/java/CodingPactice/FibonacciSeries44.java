package CodingPactice;

public class FibonacciSeries44 {

	public static void main(String[] args) {

		int n = 10, First = 0, Second = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(First + ",");

			int nextItem = First + Second;
			First = Second;
			Second = nextItem;
		}
	}

}
