package CodingPactice;

public class FibonacciSeries3 {

	public static void main(String[] args) {
		int n = 10, fisrtno = 0, secondno = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print(fisrtno + " ,");

			int temp = fisrtno + secondno;
			fisrtno = secondno;
			secondno = temp;
		}

	}

}
