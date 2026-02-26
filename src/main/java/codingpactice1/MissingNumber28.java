package codingpactice1;

public class MissingNumber28 {
	public static void main(String[] args) {

		int[] arr = { 2, 5, 3, 4 };
		int n = arr.length + 1;

		int expectedResult = n * (n + 1) / 2;
		int actualResult = 0;

		for (int i : arr) {
			actualResult += i;
		}
		System.out.println(expectedResult - actualResult);
	}

}
