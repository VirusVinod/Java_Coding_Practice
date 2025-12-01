package codingpactice1;

public class ReverseString7 {

	public static void main(String[] args) {

		String str = "345678";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) + res;
		}
		System.out.println(res);
	}

}
