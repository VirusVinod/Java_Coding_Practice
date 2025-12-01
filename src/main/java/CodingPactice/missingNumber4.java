package CodingPactice;

public class missingNumber4 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		int n = arr.length + 1;

		int expectedRes = n * (n + 1) / 2;
		int actualres = 0;

		for (int i : arr) {
			actualres += i;
		}
		System.out.println(expectedRes - actualres);
	}

}
