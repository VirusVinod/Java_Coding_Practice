package CodingPactice;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {

		int[] abc = { 2, 3, 3, 1, 2, 5, 3, 8, 1 };
		int n = abc.length;

		for (int i = 0; i < n; i++) {

			boolean isDup = false;

			for (int j = 0; j < i; j++) {
				if (abc[i] == abc[j]) {
					isDup = true;
					break;
				}
			}
			if (!isDup) {
				System.out.print(abc[i] +",");
			}
		}

	}

}
