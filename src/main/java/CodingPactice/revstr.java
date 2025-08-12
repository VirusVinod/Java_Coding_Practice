package CodingPactice;

public class revstr {

	public static void main(String[] args) {

		String abc = "vinod";
		String res = "";

		for (int i = 0; i < abc.length(); i++) {

			res = abc.charAt(i) + res;

		}
		System.out.println(res);

	}

}
