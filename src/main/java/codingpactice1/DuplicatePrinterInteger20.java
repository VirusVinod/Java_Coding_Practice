package codingpactice1;

public class DuplicatePrinterInteger20 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 3, 2, 4, 5, 6, 9, 4 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			boolean isDupliacte = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDupliacte = true;
					break;
				}
			}
			if (isDupliacte) {
				continue;
			}
			for (int k = i + 1; k < n; k++) {
				if (arr[k] == arr[i]) {
					isDupliacte = true;
					break;
				}
			}
			if (isDupliacte) {
				System.out.print(arr[i] + ",");
			}

		}
	}

}
