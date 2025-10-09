package CodingPactice;

public class ReverseInteger7 {

	public static void main(String[] args) {

		int x = 567;
		int res = 0;

		while (x != 0) {
			int temp = x % 10;
			res = res * 10 + temp;
			x /= 10;

		}
		System.out.println(res);
	}

}
