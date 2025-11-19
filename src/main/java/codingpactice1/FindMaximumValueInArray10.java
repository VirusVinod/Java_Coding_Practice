package codingpactice1;

public class FindMaximumValueInArray10 {

	public static void main(String[] args) {

		int[] arr = { 34, 342, 2323, 435, 67 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
