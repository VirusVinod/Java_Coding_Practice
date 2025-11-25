package codingpactice1;

public class FindMaximumValueInArray12 {

	public static void main(String[] args) {

		int[] arr = { 22, 34, 55, 23 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
