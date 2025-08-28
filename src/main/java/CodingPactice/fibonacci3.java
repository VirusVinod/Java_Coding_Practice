package CodingPactice;

public class fibonacci3 {

	public static void main(String[] args) {
		int n = 10, firstItem = 0, SecItem = 1;

		for (int i = 1; i <= n; i++) {

			System.out.print(firstItem + " ,");

			int temp = firstItem + SecItem;
			firstItem = SecItem;
			SecItem = temp;
		}

	}

}
