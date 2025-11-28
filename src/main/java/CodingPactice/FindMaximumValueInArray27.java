package CodingPactice;

public class FindMaximumValueInArray27 {
	public static void main(String[] args) {

		int[] arr = { 33, 3, 34, 56 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
