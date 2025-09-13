package CodingPactice;

public class Removedupint16 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 2 };
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
