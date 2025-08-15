package CodingPactice;

public class OccurrencesStr {

	public static void main(String[] args) {

		String org = "Automationin";
		int[] n = new int[256];

		for (int i = 0; i < org.length(); i++) {
			n[org.charAt(i)]++;
		}

		for(int j=0; j<256;j++) {
			if(n[j]>1) {
				System.out.println((char)j + ":"+n[j]);
			}
		}

	}

}
