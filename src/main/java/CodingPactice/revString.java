package CodingPactice;

public class revString {

	public static void main(String[] args) {

		String abc = "Hello";
		String rev = "";

		for (int i = 0; i < abc.length(); i++) {
			rev = abc.charAt(i) + rev;
		}
		System.out.print(rev);
	}

}
