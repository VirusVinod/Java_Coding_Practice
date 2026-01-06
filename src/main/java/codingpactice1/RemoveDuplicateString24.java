package codingpactice1;

public class RemoveDuplicateString24 {
	public static void main(String[] args) {

		String str = "WERTYUUYTREWERTREW";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (res.indexOf(ch) == -1) {
				res += ch;
			}
		}
		System.out.println(res);
	}

}
