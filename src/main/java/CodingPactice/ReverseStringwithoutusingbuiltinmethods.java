package CodingPactice;

//Write a program to reverse a string without using built-in methods. 

public class ReverseStringwithoutusingbuiltinmethods {

	public static void main(String[] args) {
		String input = "Hello World";
		System.out.println("Original String: " + input);
		String reversed = reverseString(input);
		System.out.println("Reversed String: " + reversed);
	}
 
	public static String reverseString(String str) {
		char[] chars = str.toCharArray();
		int left = 0;
		int right = chars.length - 1;

		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;

	 		left++;
			right--;
		}
		return new String(chars);
	}

}
