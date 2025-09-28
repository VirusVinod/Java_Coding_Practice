package CodingPactice;

public class FindMaximumValueInArray4 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 11, 23, 32, 234, 111 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
