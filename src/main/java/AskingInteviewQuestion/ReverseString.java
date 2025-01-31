package AskingInteviewQuestion;

public class ReverseString {
	public static String reverse(String str) {
		char[] charArray = str.toCharArray();
		int left = 0, right = str.length() - 1;

		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;

			left++;
			right--;
		}

		return new String(charArray);
	}

	public static void main(String[] args) {
		String input = "Vinod";
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reverse(input));
	}
}
