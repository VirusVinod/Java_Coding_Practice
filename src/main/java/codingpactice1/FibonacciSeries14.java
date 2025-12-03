package codingpactice1;

public class FibonacciSeries14 {
	public static void main(String[] args) {

		int n = 10, fisrt = 0, second = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(fisrt + ",");

			int nextItem = fisrt + second;
			fisrt = second;
			second = nextItem;
		}
	}

}
