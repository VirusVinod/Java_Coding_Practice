package CodingPactice;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = 123;
		int res = 0;

		while (x != 0) {
			int digit = x % 10;
			res = res * 10 + digit;
			x /= 10;
		}

		System.out.println(res);

	}

}
