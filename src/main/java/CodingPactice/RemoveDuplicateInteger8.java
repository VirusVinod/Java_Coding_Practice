package CodingPactice;

public class RemoveDuplicateInteger8 {

	public static void main(String[] args) {

		int[] arr = { 121, 2, 3, 4, 53, 2, 3, 121 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isdup = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isdup = true;
					break;
				}
			}
			System.out.print(arr[i] + ",");
		}

	}

}
