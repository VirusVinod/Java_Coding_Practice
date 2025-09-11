package CodingPactice;

public class RemoveDuplicateString13 {

	public static void main(String[] args) {
		String abc = "HiHi";
		String Res = "";

		for (int i = 0; i < abc.length(); i++) {

			char ch = abc.charAt(i);

			if (Res.indexOf(ch) == -1) {
				Res += ch;
			}

		}
		System.out.println(Res);

	}

}
