package codingpactice1;

public class FindMaximumValueInArray17 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 33, 44, 3, 2 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
