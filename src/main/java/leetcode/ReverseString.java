package leetcode;

public class ReverseString {
	public static void main(String[] args) {

		String str = "coddingpur";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + " " + res;
		}
		System.out.print(res);
	}

}
