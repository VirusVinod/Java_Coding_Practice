package CodingPactice;

public class CountOddandEvenNumbersinArray1 {
	public static void main(String[] args) {

		int[] arr = { 22, -23, 11, -97, 44, 32, 56 };
		int oddCount = 0;
		int evenCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				oddCount++;
			} else {
				evenCount++;
			}
		}

		System.out.println("odd count : " + oddCount);
		System.out.println("even count : " + evenCount);

	}

}
