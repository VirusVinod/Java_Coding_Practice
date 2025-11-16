package codingpactice1;

public class FindMaximumValueInArray7 {

	public static void main(String[] args) {

		int[] arr = { 33, 32, 2, 323, 231 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
