package codingpactice1;

public class FindMaximumValueInArray15 {

	public static void main(String[] args) {
		int[] arr = { 11, 23, 45, 223, 32 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(max);
	}

}
