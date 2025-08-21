package CodingPactice;

public class Removedupint {

	public static void main(String[] args) {
		int[] org = { 1, 2, 3, 4, 4, 3, 2, 1, 7, 6, 9, 1, 2, 3, 4, 4, 3, 2, 1, 7, 6, 9 };
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
