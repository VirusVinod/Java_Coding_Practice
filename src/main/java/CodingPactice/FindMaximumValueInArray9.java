package CodingPactice;

public class FindMaximumValueInArray9 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 33, 55, 444, 32, 1123, 423 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(max);
	}

}
