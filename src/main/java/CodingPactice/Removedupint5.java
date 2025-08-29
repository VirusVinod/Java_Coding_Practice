package CodingPactice;

public class Removedupint5 {

	public static void main(String[] args) {
		int[] value = { 11, 12, 13, 14, 22, 11, 18, 19, 12, 14 };
		int n = value.length;

		for (int i = 0; i < n; i++) {
			boolean isdup = false;
			for (int j = 0; j < i; j++) {
				if (value[i] == value[j]) {
					isdup = true;
					break;

				}
			}
			if (!isdup) {
				System.out.print(value[i] + ",");
			}
		}

	}

}
