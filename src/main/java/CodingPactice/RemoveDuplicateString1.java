package CodingPactice;

public class RemoveDuplicateString1 {

	public static void main(String[] args) {
		String org = "Happy New Year";
		String rev = "";

		for (int i = 0; i < org.length(); i++) {
			char ch = org.charAt(i);
			
			if(ch != ' ' && rev.indexOf(ch) == -1  ) {
				rev += ch;
			}
		}
		System.out.println(rev);

	}

}
