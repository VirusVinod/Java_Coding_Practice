package codingpactice1;

public class FindMaximumValueInArray21 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 67, 32, 21, 34 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
