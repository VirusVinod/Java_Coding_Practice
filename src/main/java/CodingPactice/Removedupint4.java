package CodingPactice;

public class Removedupint4 {

	public static void main(String[] args) {
		int[] str = { 1, 21, 3, 44, 4, 3, 21, 1, 7, 6, 19, 1, 2, 3, 44, 4, 33, 2, 1, 7, 6, 19 };
		int n = str.length;

		for (int i = 0; i < n; i++) {
			boolean isdup = false;
			for (int j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					isdup = true;
					break;

				}
			}
			if (!isdup) {
				System.out.print(str[i] + ",");
			}

		}

	}

}
