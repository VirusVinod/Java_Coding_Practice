package CodingPactice;

public class finddupint6 {

	public static void main(String[] args) {

		int[] org = { 2, 1, 2, 3, 5, 23, 12, 1, 12, 4, 6, 7, 23 };
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
