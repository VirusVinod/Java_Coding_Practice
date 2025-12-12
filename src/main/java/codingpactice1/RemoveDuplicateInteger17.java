package codingpactice1;

public class RemoveDuplicateInteger17 {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 3, 2 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isdiup = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isdiup = true;
					break;
				}
			}
			if (!isdiup) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
