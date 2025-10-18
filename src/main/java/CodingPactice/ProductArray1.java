package CodingPactice;

public class ProductArray1 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 23 };
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			count = count * arr[i];
		}
		System.out.println(count);

	}

}
