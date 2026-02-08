package codingpactice1;

public class MissingNumber25 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6 };
		int n = arr.length + 1;

		int expectedResult = n * (n + 1) / 2;
		int actualRes = 0;

		for (int i : arr) {
			actualRes += i;
		}

		System.out.println(expectedResult - actualRes);

	}

}
