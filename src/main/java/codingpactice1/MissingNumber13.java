package codingpactice1;

public class MissingNumber13 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6 };
		int n = arr.length + 1;

		int expectedres = n * (n + 1) / 2;
		int actualRes = 0;

		for (int i : arr) {
			actualRes += i;
		}
		System.out.println(expectedres - actualRes);
	}

}
