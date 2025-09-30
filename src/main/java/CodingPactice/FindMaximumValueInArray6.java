package CodingPactice;

public class FindMaximumValueInArray6 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 3, 332 };
		int n = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > n) {
				n = arr[i];

			}
		}
		System.out.print(n);
	}

}
