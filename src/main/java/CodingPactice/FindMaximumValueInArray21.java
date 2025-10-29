package CodingPactice;

public class FindMaximumValueInArray21 {
	public static void main(String[] args) {

		int[] arr = { 231, 324, 532, 23, 213 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
