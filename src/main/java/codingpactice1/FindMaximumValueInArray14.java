package codingpactice1;

public class FindMaximumValueInArray14 {

	public static void main(String[] args) {

		int[] arr = { 1, 12, 2, 33, 4, 5, 56, 32 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
