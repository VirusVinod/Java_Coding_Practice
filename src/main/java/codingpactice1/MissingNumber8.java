package codingpactice1;

public class MissingNumber8 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 7 };
		int n = arr.length + 1;
		int expectedRes = n * (n + 1) / 2;
		int actuales = 0;

		for (int i : arr) {
			actuales += i;
		}
		System.out.println(expectedRes - actuales);
	}

}
