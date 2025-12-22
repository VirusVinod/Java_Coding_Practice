package codingpactice1;

public class DuplicatePrinterInteger14 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 12, 3, 12, 3, 4, 5, 6 };
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
				if (arr[k] == arr[i]) {
					isduplicate = true;
					break;
				}
			}
			if (isduplicate) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
