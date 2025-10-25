package CodingPactice;

public class FindMaximumValueInArray19 {
	public static void main(String[] args) {

		int[] arr = { 23, 34, 4232, 23, 23 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
