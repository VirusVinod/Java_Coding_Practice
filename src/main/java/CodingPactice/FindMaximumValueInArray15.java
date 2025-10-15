package CodingPactice;

public class FindMaximumValueInArray15 {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 223, 23, 5, 67, 77, 7, 787 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(max);

	}

}
