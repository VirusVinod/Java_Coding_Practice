package CodingPactice;

public class FindMaximumValueInArray16 {

	public static void main(String[] args) {

		int[] arr = { 3, 34, 556, 78, 9, 0, 1 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.print(max);
	}

}
