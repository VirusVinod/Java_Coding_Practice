package codingpactice1;

public class DuplicatePrinterInteger8 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 1, 3, 2, 2, 4 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean sidupprint = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					sidupprint = true;
					break;
				}
			}
			if (sidupprint) {
				continue;
			}
			for (int k = i + 1; k < n; k++) {
				if (arr[k] == arr[i]) {
					sidupprint = true;
					break;
				}
			}
			if (sidupprint) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
