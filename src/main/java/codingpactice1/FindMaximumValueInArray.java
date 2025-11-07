package codingpactice1;

public class FindMaximumValueInArray {

	public static void main(String[] args) {

		int[] arr = { 22, 33, 45, 656, 33, 232 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
