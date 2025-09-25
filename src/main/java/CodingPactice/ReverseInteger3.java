package CodingPactice;

public class ReverseInteger3 {

	public static void main(String[] args) {

		int str = 562;
		int n = 0;

		while (str != 0) {

			int temp = str % 10;
			n = n * 10 + temp;
			str /= 10;

		}
		System.out.println(n);
	}

}
