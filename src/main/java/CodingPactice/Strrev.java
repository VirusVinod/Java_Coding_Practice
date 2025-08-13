package CodingPactice;

public class Strrev {

	public static void main(String[] args) {

		String org = "vinod";
		String rev = " ";

		for (int i = 0; i < org.length(); i++) {
			
			rev = org.charAt(i)+" "+rev;

		}
		System.out.println(rev);

	}

}
