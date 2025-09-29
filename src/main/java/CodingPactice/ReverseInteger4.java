package CodingPactice;

public class ReverseInteger4 {

	public static void main(String[] args) {

		int abc = 123;
		int res = 0;

		while (abc != 0) {
			int digit = abc % 10;
			res = res * 10 + digit;
			abc /= 10;

		}
		System.out.println(res);

	}

}
