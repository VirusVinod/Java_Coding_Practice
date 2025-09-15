package CodingPactice;

public class Removedupint17 {

	public static void main(String[] args) {
		int[] value = { 101, 121, 13, 140, 22, 101, 18, 19, 121, 140 };
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
