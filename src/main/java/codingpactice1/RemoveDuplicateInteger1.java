package codingpactice1;

public class RemoveDuplicateInteger1 {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2, 2, 3, 3, 3, 2 };
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
