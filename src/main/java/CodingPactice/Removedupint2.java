package CodingPactice;

public class Removedupint2 {

	public static void main(String[] args) {
		int[] abc = { 1, 2, 1, 2, 1, 2, 3, 4, 4, 3, 5, 6, 6, 5 };
		int n = abc.length;

		for (int i = 0; i < n; i++) {
			boolean isdup = false;

			for (int j = 0; j < i; j++) {
				if (abc[i] == abc[j]) {
					isdup = true;
					break;
				}
			}
			if (!isdup) {
				System.out.print(abc[i] + ",");
			}
		}

	}

}
