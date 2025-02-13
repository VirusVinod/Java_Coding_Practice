package InterviewQes;


public class DuplicateCharacters {
	public static void main(String[] args) {
        String str = "programming"; 
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        boolean hasDuplicates = false;

//        System.out.println("Duplicate characters in the string:");

        for (int i = 0; i < length; i++) {
            if (charArray[i] == ' ') 
                continue;

            int count = 1;
            for (int j = i + 1; j < length; j++) {
                if (charArray[i] == charArray[j] && charArray[j] != '0') {
                    count++;
                    charArray[j] = '0'; 
                }
            }
            if (count > 1) {
                System.out.println(charArray[i] + ": " + count);
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate characters found.");
        }
    }
}
