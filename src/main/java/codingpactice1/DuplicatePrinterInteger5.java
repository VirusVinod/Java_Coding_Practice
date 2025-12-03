package codingpactice1;

public class DuplicatePrinterInteger5 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 2, 3, 1 };
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
				if (arr[i] == arr[k]) {
					System.out.print(arr[i] + ",");
				}
			}
		}
	}

}
