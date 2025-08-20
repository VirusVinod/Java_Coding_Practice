package CodingPactice;

public class Finddupint9 {

	public static void main(String[] args) {
		int[] org = { 1, 4, 2, 3, 4, 1, 4, 2, 5, 9, 7, 8, 9 };
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
