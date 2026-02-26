package codingpactice1;

public class FindMaximumValueInArray33 {
	public static void main(String[] args) {

		int[] arr = { 1, 22, 33, 44, 12, 33 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(max);
	}

}
