package leetcode;

public class DuplicatePrinterInteger {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 2, 4, 2 };
		int n = arr.length;

		System.out.print("Duplicate integers: ");

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
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
	}

}
