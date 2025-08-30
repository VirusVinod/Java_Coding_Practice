package CodingPactice;

public class Removedupint6 {

	public static void main(String[] args) {
		int[] abc = { 1, 2, 1, 2, 8, 9, 0, 5, 4, 1, 2, 1, 2, 8, 9, 0, 5, 4 };
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
