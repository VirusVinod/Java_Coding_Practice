package codingpactice1;

public class MissingNumber32 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5 };
		int n = arr.length + 1;

		int expextedRes = n * (n + 1) / 2;
		int actualres = 0;

		for (int i : arr) {
			actualres += i;
		}
		System.out.println(expextedRes - actualres);
	}

}
