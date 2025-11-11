package codingpactice1;

public class FindMaximumValueInArray4 {
	public static void main(String[] args) {

		int[] arr = { 3, 3, 3, 32, 22, 1, 23, 4, 4, 444 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
