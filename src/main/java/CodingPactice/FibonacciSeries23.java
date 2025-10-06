package CodingPactice;

public class FibonacciSeries23 {

	public static void main(String[] args) {

		int[] arr = { 22, 3, 4, 5, 56, 7, 78, 9 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
