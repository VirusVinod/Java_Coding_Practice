package codingpactice1;

public class DuplicatePrinterInteger3 {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 3, 5, 12, 12, 1, 1 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean dup = false;

			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					dup = true;
					break;
				}
			}
			if (dup) {
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
