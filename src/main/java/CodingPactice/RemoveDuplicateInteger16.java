package CodingPactice;

public class RemoveDuplicateInteger16 {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 1, 1, 9, 0, 0, 1, };
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
