package CodingPactice;

public class Fibonacci {

	public static void main(String[] args) {

		int n = 10, firstItem = 0, secondItem = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(firstItem + ",");
			
			
			int mextItem = firstItem + secondItem;
			
			firstItem = secondItem;
			secondItem = mextItem;
		}

	}

}
