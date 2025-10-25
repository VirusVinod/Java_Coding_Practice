package CodingPactice;

public class FindOccurrenceofWords {

	public static void main(String[] args) {
		String str = "abc is abc xyz abc is";
		String[] wordsCount = str.split(" ");
		int count;

		for (int i = 0; i < wordsCount.length; i++) {
			count = 1;
			if (wordsCount[i].equals(""))
				continue;
			for (int j = i + 1; j < wordsCount.length; j++) {
				if (wordsCount[i].equals(wordsCount[j])) {
					count++;
					wordsCount[j] = "";

				}
			}
			System.out.println(wordsCount[i] + " - " + count);

		}
	}

}
