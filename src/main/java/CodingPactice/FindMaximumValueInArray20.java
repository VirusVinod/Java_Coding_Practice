package CodingPactice;

public class FindMaximumValueInArray20 {

	public static void main(String[] args) {

		int[] arr = { 22, 32, 1, 2, 3, 322 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
