package CodingPactice;

public class FindMaximumValueInArray24 {

	public static void main(String[] args) {

		int[] arr = { 22, 12, 78, 33, 67, 90 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
