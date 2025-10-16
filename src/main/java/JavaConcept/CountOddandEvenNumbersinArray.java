package JavaConcept;

public class CountOddandEvenNumbersinArray {

	public static void main(String[] args) {

		int[] arr = { 22, -34, 43, -43, -24, 23, 34 };
		int oddCount = 0;
		int evnCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				oddCount++;
			} else {
				evnCount++;
			}
		}
		System.out.println("Odd count : " + oddCount);
		System.out.println("Even count : " + evnCount);

	}

}
