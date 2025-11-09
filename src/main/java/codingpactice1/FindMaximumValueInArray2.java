package codingpactice1;

public class FindMaximumValueInArray2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 2, 5, 61, 4, 3, 5 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
