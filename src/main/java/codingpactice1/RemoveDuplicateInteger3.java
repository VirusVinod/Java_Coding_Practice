package codingpactice1;

public class RemoveDuplicateInteger3 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 2, 23, 23, 45, 54, 45 };
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
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
