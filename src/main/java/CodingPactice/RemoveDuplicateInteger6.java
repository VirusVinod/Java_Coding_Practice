package CodingPactice;

public class RemoveDuplicateInteger6 {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 4, 4, 5 };
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
