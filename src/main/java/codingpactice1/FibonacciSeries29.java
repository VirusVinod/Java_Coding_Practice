package codingpactice1;

public class FibonacciSeries29 {
	public static void main(String[] args) {

		int n = 10, first = 0, second = 1;

		for (int i = 0; i < n; i++) {

			System.out.print(first + ",");

			int nextItem = first + second;
			first = second;
			second = nextItem;
		}
	}

}
