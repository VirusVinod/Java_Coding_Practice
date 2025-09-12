package CodingPactice;

public class FibonacciSeries9 {

	public static void main(String[] args) {
		int n = 10, firts = 0, second = 1;

		for (int i = 0; i <= n; i++) {
			System.out.print(firts + ",");
			int temp = firts + second;
			firts = second;
			second = temp;
		}

	}

}
