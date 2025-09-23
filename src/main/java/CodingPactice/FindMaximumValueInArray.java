package CodingPactice;

public class FindMaximumValueInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 121, 345, 12, 34,433 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
