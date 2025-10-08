package CodingPactice;

public class FindMaximumValueInArray10 {

	public static void main(String[] args) {

		int[] arr = { 343, 33, 32, 456, 33, 354, 2345 };
		int count = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > count) {
				count = arr[i];
			}
		}
		System.out.println(count);
	}

}
