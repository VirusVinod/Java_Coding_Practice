package CodingPactice;

public class FindMaximumValueInArray14 {
	public static void main(String[] args) {

		int[] arr = { 122, 312, 3, 44, 5 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(max);

	}

}
