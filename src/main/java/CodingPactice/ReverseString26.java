package CodingPactice;

public class ReverseString26 {
	
	public static void main(String[] args) {

		String str = "1986";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.println(res);
	}

}
