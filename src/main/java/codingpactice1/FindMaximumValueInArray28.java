package codingpactice1;

public class FindMaximumValueInArray28 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 345, 232, 223, 23, 1 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
