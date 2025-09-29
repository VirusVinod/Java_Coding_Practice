package CodingPactice;

public class FindMaximumValueInArray5 {

	public static void main(String[] args) {
		int[] arr = { 2, 222, 3333, 4, 5555, 6, 13445 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
