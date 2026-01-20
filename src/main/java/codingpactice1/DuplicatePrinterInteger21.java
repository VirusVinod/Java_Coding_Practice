package codingpactice1;

public class DuplicatePrinterInteger21 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 4, 2, 1, 3 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate) {
				continue;
			}
			for (int k = i + 1; k < n; k++) {
				if (arr[i] == arr[k]) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate) {
				System.out.print(arr[i] + ",");
			}
		}

	}

}
