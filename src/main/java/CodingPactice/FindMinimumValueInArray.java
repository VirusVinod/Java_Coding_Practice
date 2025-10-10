package CodingPactice;

public class FindMinimumValueInArray {

	public static void main(String[] args) {

		int[] arr = { 3, 33, 2, 111 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);

	}

}
