package CodingPactice;

public class ProductArray {

	public static void main(String[] args) {

		int[] arr = { 4, 6, 24, 24 };
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			count = count * arr[i];
		}
		System.out.println(count);

	}

}
