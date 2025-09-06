package CodingPactice;

public class Removedupint10 {

	public static void main(String[] args) {
		int[] org = { 1, 1, 3, 4, 3, 4, 2, 2 };
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
