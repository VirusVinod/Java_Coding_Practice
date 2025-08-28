package CodingPactice;

public class RemoveDuplicateString2 {

	public static void main(String[] args) {
		String str = "Automationaaaoooouu";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (res.indexOf(ch) == -1) {

				res += ch;

			}
		}
		System.out.print(res);

	}

}
