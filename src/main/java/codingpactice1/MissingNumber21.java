package codingpactice1;

public class MissingNumber21 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5 };
		int n = arr.length + 1;

		int expected = n * (n + 1) / 2;
		int actualres = 0;

		for (int i : arr) {
			actualres += i;
		}
		System.out.println(expected - actualres);
	}
}
