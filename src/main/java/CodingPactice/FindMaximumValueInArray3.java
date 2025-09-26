package CodingPactice;

public class FindMaximumValueInArray3 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 11, 5, 3, 2, 8, 6, 5 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
