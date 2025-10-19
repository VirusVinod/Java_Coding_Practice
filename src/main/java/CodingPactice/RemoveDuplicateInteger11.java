package CodingPactice;

public class RemoveDuplicateInteger11 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 55, 6, 6, 2, 3 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isdup = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isdup = true;
					break;
				}
			}
			if (!isdup) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
