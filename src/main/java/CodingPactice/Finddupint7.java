package CodingPactice;

public class Finddupint7 {

	public static void main(String[] args) {

		int[] org = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1, 7, 8, 9, 7 };
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
