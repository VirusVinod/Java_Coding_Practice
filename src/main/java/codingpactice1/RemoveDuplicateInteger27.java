package codingpactice1;

public class RemoveDuplicateInteger27 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2 };
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			boolean isdupicate = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isdupicate = true;
					break;
				}
			}
			if (!isdupicate) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
