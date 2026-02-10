package codingpactice1;

public class DuplicateCharactersCount36 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 4 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isduplicatePrint = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isduplicatePrint = true;
					break;
				}
			}
			if (isduplicatePrint) {
				continue;
			}
			for (int k = i + 1; k < n; k++) {
				if (arr[i] == arr[k]) {
					isduplicatePrint = true;
					break;
				}
			}
			if (isduplicatePrint) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
