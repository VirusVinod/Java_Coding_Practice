package codingpactice1;

public class MissingNumber2 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length + 1;

		int expectedRes = n * (n + 1) / 2;
		int asctualRes = 0;

		for (int i : arr) {
			asctualRes += i;
		}
		System.out.println(expectedRes - asctualRes);
	}

}
