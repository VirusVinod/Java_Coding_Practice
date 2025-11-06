package CodingPactice;

public class RemoveDuplicateInteger33 {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 3, 10, 88, 10 };

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
