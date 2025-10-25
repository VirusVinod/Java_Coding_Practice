package CodingPactice;

public class RemoveDuplicateInteger17 {
	public static void main(String[] args) {

		int[] arr = { 22, 21, 33, 22, 21, 1, 2, 12, 32, 1, 3, 2 };
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
