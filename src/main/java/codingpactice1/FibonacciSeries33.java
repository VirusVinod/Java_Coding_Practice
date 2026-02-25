package codingpactice1;

public class FibonacciSeries33 {
	public static void main(String[] args) {

		int n = 10, first = 0, sencod = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(first + ",");

			int nextFirst = first + sencod;
			first = sencod;
			sencod = nextFirst;
		}

	}

}
