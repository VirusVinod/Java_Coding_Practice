package CodingPactice;

public class ReverseInteger8 {

	public static void main(String[] args) {

		int n = 7453;
		int res = 0;

		while (n != 0) {
			int digit = n % 10;
			res = res * 10 + digit;
			n /= 10;
		}
		System.out.println(res);
	}

}
