package codingpactice1;

public class FindMaximumValueInArray5 {

	public static void main(String[] args) {

		int[] arr = { 13, 3, 223, 32, 52, 51, 23, 4, 34, 34 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
