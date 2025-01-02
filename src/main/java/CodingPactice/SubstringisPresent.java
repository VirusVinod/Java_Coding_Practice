package CodingPactice;

//Check if Substring is Present in a Given String

public class SubstringisPresent {

	public static boolean isSubstring(String main, String substring) {

		return main.matches("(.*)" + substring + "(.*)");
	}

	public static boolean isSubstring1(String main, String substring) {

		return main.contains(substring);
	}
	
	public static boolean isSubstring2(String main, String substring) {

		return main.indexOf(substring)!=-1;
	}
 
	public static void main(String[] args) {

		System.out.println(isSubstring("auutomation classs", "classs"));
		System.out.println(isSubstring1("auutomation classs", "classs"));
		System.out.println(isSubstring2("auutomation classs", "classs"));

		
	}

}
