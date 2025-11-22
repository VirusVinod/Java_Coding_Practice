package codingpactice1;

public class FindMaximumValueInArray11 {
	public static void main(String[] args) {

		int[] arr = { 2, 34, 31, 2, 45, 67, 8, 99 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println(max);
	}
}
