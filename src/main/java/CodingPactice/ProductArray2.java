package CodingPactice;

public class ProductArray2 {

	public static void main(String[] args) {
		int[] arr = { 34, 4, 56, 7 };
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			count = count * arr[i];
		}
		System.out.println(count);
	}

}
