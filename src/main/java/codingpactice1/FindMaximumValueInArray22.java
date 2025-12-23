package codingpactice1;

public class FindMaximumValueInArray22 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 44, 56, 22, 11 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
