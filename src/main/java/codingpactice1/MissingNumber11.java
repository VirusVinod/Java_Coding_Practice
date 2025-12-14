package codingpactice1;

public class MissingNumber11 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
		int n = arr.length + 1;

		int expectedVlaue = n * (n + 1) / 2;
		int actualres = 0;

		for (int i : arr) {
			actualres += i;
		}
		System.out.println(expectedVlaue - actualres);
	}

}
