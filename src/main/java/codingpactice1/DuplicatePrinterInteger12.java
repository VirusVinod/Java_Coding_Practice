package codingpactice1;

public class DuplicatePrinterInteger12 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 2, 3, 4, 2, 3, 4, 5, 6 };
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
				if (arr[i] == arr[k]) {
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
