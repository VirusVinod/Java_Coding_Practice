package CodingPactice;

public class findupstr {

	public static void main(String[] args) {

		String abc = "AutomationAutomation";
		String rev = "";

		for (int i = 0; i < abc.length(); i++) {
			char ch = abc.charAt(i);
			if (rev.indexOf(ch) == -1) {
				rev += ch;
			}
		}

		System.out.println(rev);
	}

}
