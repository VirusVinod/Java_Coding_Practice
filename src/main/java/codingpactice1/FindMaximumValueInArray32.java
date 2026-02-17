package codingpactice1;

public class FindMaximumValueInArray32 {
	public static void main(String[] args) {

		int[] arr = { 12, 32, 11, 23, 44, 55, 11, 2 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
