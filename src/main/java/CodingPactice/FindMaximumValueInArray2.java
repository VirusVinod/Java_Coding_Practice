package CodingPactice;

public class FindMaximumValueInArray2 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 8, 4 };
		int n = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > n) {
				n = arr[i];
			}

		}
		System.out.println(n);
	}

}
