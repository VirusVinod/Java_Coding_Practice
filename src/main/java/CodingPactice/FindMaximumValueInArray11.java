package CodingPactice;

public class FindMaximumValueInArray11 {
	public static void main(String[] args) {

		int[] arr = { 2, 2, 222, 22 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(max);

	}

}
