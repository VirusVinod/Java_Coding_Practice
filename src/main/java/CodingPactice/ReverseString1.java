package CodingPactice;

public class ReverseString1 {

	public static void main(String[] args) {
		String s = "Vinod";
		String rev = "";

		for (int i = 0; i < s.length(); i++) {

			rev = s.charAt(i) + rev;
		}

		System.out.println(rev);
	}

}
