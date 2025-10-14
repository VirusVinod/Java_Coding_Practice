package CodingPactice;

public class RemoveDuplicateString29 {

	public static void main(String[] args) {
		String org = "AAAAAAAAABBBBBBBBBCCC";
		String res = "";

		for (int i = 0; i < org.length(); i++) {
			char ch = org.charAt(i);
			if (res.indexOf(ch) == -1) {
				res += ch;
			}
		}
		System.out.println(res);

	}

}
