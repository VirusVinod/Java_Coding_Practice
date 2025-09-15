package CodingPactice;

public class RemoveDuplicateString16 {

	public static void main(String[] args) {

		String abc = "Autuomationm";
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
