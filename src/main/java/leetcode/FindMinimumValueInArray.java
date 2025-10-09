package leetcode;

public class FindMinimumValueInArray {

	public static void main(String[] args) {

		int[] arr = { 33, 321, 234, 332, 1 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);

	}

}
