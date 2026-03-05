package codingpactice1;

public class FindMaximumValueInArray34 {

	public static void main(String[] args) {

		int[] arr = { 22, 11, 33, 45, 78 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
