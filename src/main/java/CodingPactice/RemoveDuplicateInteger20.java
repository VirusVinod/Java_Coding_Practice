package CodingPactice;

public class RemoveDuplicateInteger20 {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 2, 11 };
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
