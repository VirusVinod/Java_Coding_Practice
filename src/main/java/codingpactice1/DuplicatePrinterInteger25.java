package codingpactice1;

public class DuplicatePrinterInteger25 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 3, 5 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isduplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
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
				System.out.print(arr[i] + ",");
			}
		}

	}

}
