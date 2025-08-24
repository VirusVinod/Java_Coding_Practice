package CodingPactice;

public class MinMaxArray1 {

	public static void main(String[] args) {
		int[] a = { 10, 2, 3, 14, 7, 8, 19 };
		int min = a[0];
		int max = a[0];

		for (int i : a) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				i = max;
			}

		}
		System.out.println("smallest : " + min);
		System.out.println("smallest : " + max);

	}

}
