package codingpactice1;

public class MissingNumber5 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14 };
		int n = arr.length + 1;

		int expectedRes = n * (n + 1) / 2;
		int actualRes = 0;

		for (int i : arr) {
			actualRes += i;
		}
		System.out.println(expectedRes - actualRes);
	}

}
