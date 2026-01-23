package codingpactice1;

public class MissingNumber23 {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 5 };
		int n = arr.length + 1;

		int expectedRes = n * (n + 1) / 2;
		int actualRes = 0;

		for (int i : arr) {
			actualRes += i;
		}
		System.out.println(expectedRes - actualRes);
	}

}
