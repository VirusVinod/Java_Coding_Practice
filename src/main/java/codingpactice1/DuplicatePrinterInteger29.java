package codingpactice1;

public class DuplicatePrinterInteger29 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 2, 5, 6, 9, 10 };
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
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
				if (arr[k] == arr[i]) {
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
