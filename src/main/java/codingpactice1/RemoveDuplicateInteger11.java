package codingpactice1;

public class RemoveDuplicateInteger11 {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 3, 4, 5, 5, 3 };
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
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
