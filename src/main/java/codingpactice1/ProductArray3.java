package codingpactice1;

public class ProductArray3 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 22, 33 };
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			count = count * arr[i];
		}
		System.out.println(count);
	}

}
