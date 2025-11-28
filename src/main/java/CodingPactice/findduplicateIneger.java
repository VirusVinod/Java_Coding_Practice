package CodingPactice;

public class findduplicateIneger {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 4, 5, 6, 7, 7 };
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
				if (arr[k] == arr[i]) {
					System.out.print(arr[i] + ",");
				}
			}
		}
	}

}
