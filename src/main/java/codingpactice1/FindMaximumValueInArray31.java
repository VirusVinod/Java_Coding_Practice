package codingpactice1;

public class FindMaximumValueInArray31 {

	public static void main(String[] args) {

		int[] arr = { 1, 22, 33, 22, 44, 33 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
