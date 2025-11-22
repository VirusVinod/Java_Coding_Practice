package codingpactice1;

public class DuplicatePrinterInteger {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 3, 4, 5, 6, 6 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isdup = false;

			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					isdup = true;
					break;
				}
			}
			if (isdup) {
				continue;
			}

			for (int k = i + 1; k < n; k++) {
				if (arr[k] == arr[i]) {
					System.out.print(arr[i] + ",");
					break;
				}

			}

		}
	}

}
