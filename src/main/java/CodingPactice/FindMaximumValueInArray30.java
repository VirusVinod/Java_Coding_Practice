package CodingPactice;

public class FindMaximumValueInArray30 {

	public static void main(String[] args) {
		int[] arr = { 24, 45, 69, 24, 54, 33 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
