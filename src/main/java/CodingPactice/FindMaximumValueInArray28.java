package CodingPactice;

public class FindMaximumValueInArray28 {

	public static void main(String[] args) {

		int[] arr = { 33, 23, 34, 56, 87, 123 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
