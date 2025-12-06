package codingpactice1;

public class DuplicatePrinterInteger6 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 2, 3, 1, 3, 4, 5, 2, 1 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isdup = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isdup = true;
					break;
				}
			}
			if (isdup) {
				continue;
			}

			for (int k = i + 1; k < n; k++) {
				if (arr[k] == arr[i]) {
					isdup = true;
					break;
				}
			}
			if (isdup) {
				System.out.print(arr[i] + ",");
			}

		}

	}

}
