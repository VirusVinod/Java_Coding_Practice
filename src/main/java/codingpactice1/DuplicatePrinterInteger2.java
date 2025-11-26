package codingpactice1;

public class DuplicatePrinterInteger2 {

	public static void main(String[] args) {

		int[] arr = { 9, 9, 9, 4, 4, 3, 3, 2, 1 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate) {
				continue;
			}
			for (int k = i + 1; k < n; k++) {
				if (arr[k] == arr[i]) {
					System.out.print(arr[i] + ",");
				}
			}
		}
	}

}
