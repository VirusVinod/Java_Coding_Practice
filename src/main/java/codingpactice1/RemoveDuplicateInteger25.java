package codingpactice1;

public class RemoveDuplicateInteger25 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 3, 4, 5 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isduplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isduplicate = true;
					break;
				}
			}
			if (!isduplicate) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
