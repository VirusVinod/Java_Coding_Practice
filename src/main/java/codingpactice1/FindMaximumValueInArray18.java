package codingpactice1;

public class FindMaximumValueInArray18 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 22, 1 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
