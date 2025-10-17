package CodingPactice;

public class CountOddandEvenNumbersinArray {

	public static void main(String[] args) {
		int[] arr = { 23, 44, -54, -31, 23, 55, 66 };
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even Count : " + evenCount);
		System.out.println("Odd Count : " + oddCount);

	}

}
