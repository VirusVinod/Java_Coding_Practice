package CodingPactice;

public class FindMaximumValueInArray18 {

	public static void main(String[] args) {

		int[] arr = { 2, 233, 44444, 2323, 44 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(max);

	}

}
