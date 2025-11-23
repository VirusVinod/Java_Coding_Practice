package codingpactice1;

public class DuplicatePrinterInteger1 {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 1, 3, 3 };
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
					System.out.print(arr[i] + ",");
				}
			}
		}
	}

}
