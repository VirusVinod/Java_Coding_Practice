package CodingPactice;

public class Removedupint3 {

	public static void main(String[] args) {
		int[] org = { 11, 2, 3, 10, 4, 3, 2, 1, 7, 6, 10, 1, 2, 21, 4, 4, 3, 21, 7, 6, 10 };
		int n = org.length;

		for (int i = 0; i < n; i++) {
			boolean isdup = false;

			for (int j = 0; j < i; j++) {
				if (org[i] == org[j]) {
					isdup = true;
					break;
				}
			}
			if (!isdup) {
				System.out.print(org[i] + ",");
			}

		}

	}

}
