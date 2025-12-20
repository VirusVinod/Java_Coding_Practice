package codingpactice1;

public class MissingNumber14 {
	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 5 };
		int n = arr.length + 1;

		int expectedres = n * (n + 1) / 2;
		int actualres = 0;

		for (int i : arr) {
			actualres += i;
		}
		System.out.println(expectedres - actualres);
	}

}
