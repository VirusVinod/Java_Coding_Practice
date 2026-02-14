package codingpactice1;

public class MissingNumber26 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6 };
		int n = arr.length + 1;

		int expactedres = n * (n + 1) / 2;
		int actualres = 0;
		for (int i : arr) {
			actualres += i;
		}
		System.out.println(expactedres - actualres);
	}

}
