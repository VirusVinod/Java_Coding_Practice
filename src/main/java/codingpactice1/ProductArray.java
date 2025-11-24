package codingpactice1;

public class ProductArray {
	public static void main(String[] args) {
		int[] arr = { 3, 45, 6, 789, 12 };
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			count = count * arr[i];
		}
		System.out.println(count);

	}
}
