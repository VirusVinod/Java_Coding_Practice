package CodingPactice;

public class Removedupint9 {

	public static void main(String[] args) {
		int[] val = { 161, 12, 111, 141, 22, 161, 18, 139, 12, 141 };
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
