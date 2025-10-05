package CodingPactice;

public class FindMaximumValueInArray8 {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 3, 2, 4, 5, 7, 2 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
