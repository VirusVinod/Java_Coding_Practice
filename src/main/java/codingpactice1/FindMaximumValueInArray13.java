package codingpactice1;

public class FindMaximumValueInArray13 {

	public static void main(String[] args) {

		int[] arr = { 22, 34, 54, 2, 34, 5, 3 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
