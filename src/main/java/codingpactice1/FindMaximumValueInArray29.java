package codingpactice1;

public class FindMaximumValueInArray29 {

	public static void main(String[] args) {

		int[] arr = { 1, 22, 11, 23, 45, 32, 13 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
