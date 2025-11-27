package codingpactice1;

public class RemoveDuplicateInteger12 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean siduplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					siduplicate = true;
					break;
				}
			}
			if (!siduplicate) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
