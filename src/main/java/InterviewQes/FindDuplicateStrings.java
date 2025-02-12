package InterviewQes;

public class FindDuplicateStrings {
	public static void main(String[] args) {
        String[] words = {"AA", "BB", "AA", "CC", "BB", "EE"};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) { 
                    System.out.println(words[i]); 
                    break; 
                }
            }
        }
    }
}
