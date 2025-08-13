package CodingPactice;

public class DuplicateWordCounter {

	public static void main(String[] args) {

		String s = "vinod abc vinod abc cud sdsd";
		String[] word = s.split(" ");

		boolean[] count = new boolean[word.length];

		for (int i = 0; i < word.length; i++) {
			if (!count[i]) {
				int cou = 1;
				for (int j = i + 1; j < word.length; j++) {
					if (word[i].equals(word[j])) {
						cou++;
						count[j] = true;

					}
				}

				if (cou > 1) {
					System.out.println(word[i] + ":" + cou);
				}

			}
		}

	}

}
