package CodingPactice;

public class Removedupint8 {

	public static void main(String[] args) {
		int[] val = { 2, 3, 1, 5, 7, 9, 0, 1, 2, 5, 7, 8, 9, 7 };
		int n = val.length;

		for (int i = 0; i < n; i++) {
			boolean isdup = false;
			for (int j = 0; j < i; j++) {
				if (val[i] == val[j]) {
					isdup = true;
					break;
				}
			}
			if (!isdup) {
				System.out.print(val[i] + ",");
			}

		}

	}

}
