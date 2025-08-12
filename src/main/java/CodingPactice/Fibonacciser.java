package CodingPactice;

public class Fibonacciser {

	public static void main(String[] args) {

		int n = 10, firstItem = 0, SecondItem = 1;

		for (int i = 1; i <= n; i++) {

			System.out.print(firstItem + ",");

			int nextItem = firstItem + SecondItem;
			firstItem = SecondItem;
			SecondItem = nextItem;

		}

	}

}
