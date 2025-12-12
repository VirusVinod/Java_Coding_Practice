package codingpactice1;

public class DuplicatePrinterInteger9 {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 2, 34, 5, 6, 67, 8, 9, 2, 8 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isduplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					isduplicate = true;
					break;
				}
			}
			if (isduplicate) {
				continue;
			}
			for (int k = i + 1; k < n; k++) {
				if (arr[i] == arr[k]) {
					isduplicate = true;
					break;
				}
			}
			if (isduplicate) {
				System.out.print("Duplicate Printer Integer : " + arr[i] + ",");
			}
		}

	}

}
