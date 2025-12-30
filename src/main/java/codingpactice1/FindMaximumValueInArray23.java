package codingpactice1;

public class FindMaximumValueInArray23 {

	public static void main(String[] args) {

		int[] arr = { 12, 35, 567, 753, 23 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
