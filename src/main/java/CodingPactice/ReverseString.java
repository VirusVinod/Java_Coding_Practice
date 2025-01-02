package CodingPactice;

//How to Reverse a String

public class ReverseString {

	public static void main(String[] args) {
		String input ="hello data";
		int i;
		char[] charArray = input.toCharArray();
		String reversed = "";
		
		for(i=charArray.length-1; i >= 0;i--){
			reversed += charArray[i];{
				System.out.println("Reversed String :" + reversed);
			}
		} 
	}

}
  