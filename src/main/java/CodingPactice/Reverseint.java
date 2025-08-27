package CodingPactice;

public class Reverseint {

	public static void main(String[] args) {
		int[] abc = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4 };
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
