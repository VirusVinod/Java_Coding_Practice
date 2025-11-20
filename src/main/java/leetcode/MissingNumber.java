package leetcode;

public class MissingNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9 };
		int n = arr.length + 1;

		int expected = n * (n + 1) / 2;
		int actual = 0;

		for (int i : arr) {
			actual += i;
		}
		System.out.println(expected - actual);
	}

}
