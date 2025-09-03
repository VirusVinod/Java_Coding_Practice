package SeleniumPractice;

public class Removedupint6 {

	public static void main(String[] args) {
		int[] val = { 1, 2, 12, 1, 2, 13 };
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
