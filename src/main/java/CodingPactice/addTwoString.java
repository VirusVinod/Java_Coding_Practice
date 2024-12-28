package CodingPactice;

public class addTwoString {
	 public static void main(String[] args) {
	        String a = "ABC";
	        String b = "DEFGH";
	        String result = interleaveStrings(a, b);
	        System.out.println(result); // Output: "ADBECFGH"
	    }

	    public static String interleaveStrings(String a, String b) {
	        StringBuilder result = new StringBuilder();
	        int i = 0;

	        // Interleave characters from both strings until one string is exhausted
	        while (i < a.length() && i < b.length()) {
	            result.append(a.charAt(i));
	            result.append(b.charAt(i));
	            i++;
	        }

	        // Append the remaining part of the longer string
	        if (i < a.length()) {
	            result.append(a.substring(i));
	        } else if (i < b.length()) {
	            result.append(b.substring(i));
	        }

	        return result.toString();
	    }
}