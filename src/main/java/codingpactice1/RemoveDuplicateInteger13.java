package codingpactice1;

public class RemoveDuplicateInteger13 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 3 };
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
