package codingpactice1;

public class ProductArray5 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 34, 5 };
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			count = count * arr[i];
		}
		System.out.println(count);
	}

}
