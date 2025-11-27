package codingpactice1;

public class ProductArray2 {
	public static void main(String[] args) {

		int[] arr = { 12, 1, 34, 12 };
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			count = count * arr[i];
		}
		System.out.println(count);
	}

}
