package codingpactice1;

public class MissingNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
		int n = arr.length + 1;

		int expected = n * (n + 1) / 2;
		int actualRes = 0;

		for (int i : arr) {
			actualRes += i;
		}
		System.out.println(expected - actualRes);

	}

}
