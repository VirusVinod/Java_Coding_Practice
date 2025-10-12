package CodingPactice;

public class FindMaximumValueInArray12 {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 32, 3, 4 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(max);

	}

}
