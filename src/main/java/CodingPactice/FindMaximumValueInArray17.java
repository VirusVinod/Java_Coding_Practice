package CodingPactice;

public class FindMaximumValueInArray17 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 33, 22, 11 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
