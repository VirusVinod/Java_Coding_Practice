package CodingPactice;

public class FibonacciSeries8 {

	public static void main(String[] args) {

		int n = 10, fristItem = 0, secondItem = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print(fristItem + " ,");

			int Test = fristItem + secondItem;
			fristItem = secondItem;
			secondItem = Test;
		}

	}

}
