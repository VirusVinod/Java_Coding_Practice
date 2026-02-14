package codingpactice1;

public class DuplicatePrinterInteger23 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 3, 5, 6 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			boolean isDupicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDupicate = true;
					break;
				}
			}
			if (isDupicate) {
				continue;
			}
			for (int k = i + 1; k < n; k++) {
				if (arr[i] == arr[k]) {
					isDupicate = true;
					break;
				}
			}
			if (isDupicate) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
