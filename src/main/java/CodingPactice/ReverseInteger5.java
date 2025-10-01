package CodingPactice;

public class ReverseInteger5 {

	public static void main(String[] args) {

		int n = 874;
		int res = 0;

		while (n != 0) {

			int temp = n % 10;
			res = res * 10 + temp;
			n /= 10;

		}
		System.out.print(res);
	}

}
