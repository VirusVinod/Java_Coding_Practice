package CodingPactice;

public class FindMinimumValueInArray2 {

	public static void main(String[] args) {
		int[] arr = { 22, 3, 44, 5, 66, 7, 1, };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
