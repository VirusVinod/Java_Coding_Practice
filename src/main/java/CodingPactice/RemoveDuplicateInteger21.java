package CodingPactice;

public class RemoveDuplicateInteger21 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 1, 1, 132, 3, 3, 312 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isdiplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isdiplicate = true;
					break;
				}
			}
			if (!isdiplicate) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
