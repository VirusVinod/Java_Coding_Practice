package codingpactice1;

public class RemoveDuplicateInteger7 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 12, 2, 22, 22, 2, 11, 123, 432, 11, 12 };
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
