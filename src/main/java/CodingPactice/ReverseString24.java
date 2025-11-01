package CodingPactice;

public class ReverseString24 {
	
	public static void main(String[] args) {

		String str = "ASDFRTG2G1G23";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.println(res);
	}

}
