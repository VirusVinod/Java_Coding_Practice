package codingpactice1;

public class FindMaximumValueInArray6 {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2, 1, 121, 232, 122, 12 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max : " + max);
	}

}
