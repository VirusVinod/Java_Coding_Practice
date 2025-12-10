package codingpactice1;

public class CodeReverse1 {
	public static void main(String[] args) {

		String str = "Vinod Singh";
		String res = "";
		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != ' ') {
				temp = ch + temp;
			} else {
				res += temp + " ";
				temp = " ";

			}
		}
		res += temp;
		System.out.println(res);
	}

}
