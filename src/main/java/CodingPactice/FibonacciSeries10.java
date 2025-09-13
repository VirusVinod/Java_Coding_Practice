package CodingPactice;

public class FibonacciSeries10 {

	public static void main(String[] args) {

		int n = 10, first = 0, secomd = 1;

		for (int i = 1; i < n; i++) {
			System.out.print(first + ",");

			int temp = first + secomd;
			first = secomd;
			secomd = temp;
		}
	}

}
