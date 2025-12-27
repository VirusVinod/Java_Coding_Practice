package codingpactice1;

public class MissingNumber17 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5 };
		int n = arr.length + 1;

		int exp = n * (n + 1) / 2;
		int actual = 0;

		for (int i : arr) {
			actual += i;
		}
		System.out.println(exp - actual);
	}

}
