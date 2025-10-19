package leetcode;

public class FindOccurrenceofWords {

	public static void main(String[] args) {
		String str = "programming programming is programming is";
		String[] words = str.split(" ");
		int count;

		for (int i = 0; i < words.length; i++) {
			count = 1;
			if (words[i].equals(""))
				continue;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "";

				}
			}
			System.out.println(words[i] + " - " + count);
		}

	}

}
