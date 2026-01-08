package codingpactice1;

public class DuplicatePrinterInteger19 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 3, 6, 7 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isDupiacre = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDupiacre = true;
					break;
				}
			}
			if (isDupiacre) {
				continue;
			}
			for (int k = i + 1; k < n; k++) {
				if (arr[k] == arr[i]) {
					isDupiacre = true;
					break;
				}
			}
			if (isDupiacre) {
				System.out.print(arr[i] + ",");
			}
		}

	}

}
