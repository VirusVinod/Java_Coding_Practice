package CodingPactice;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = { 8, 2, 4, 5, 3, 7, 1, 6, 10 };
		int n = arr.length + 1;
		int expected = n * (n + 1) / 2;
		int actual = 0;
		for (int i : arr) {
			actual += i;
		}
		System.out.print(expected - actual);

	}

}
