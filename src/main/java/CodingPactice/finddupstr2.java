package CodingPactice;

public class finddupstr2 {

	public static void main(String[] args) {

		String org = "AutomationAutomation";
		String rev = "";

		for (int i = 0; i < org.length(); i++) {
			char ch = org.charAt(i);
			if (rev.indexOf(ch) == -1) {
				rev += ch;
			}
		}

		System.out.print(rev);

	}

}
