package CodingPactice;

public class Reversenum {

	public static void main(String[] args) {

		int num = 1234567;
		int resverd = 0;

		for (int i = num; i != 0; i /= 10) {

			int temp = i % 10;
			resverd = resverd * 10 + temp;

		}
		System.out.print(resverd);
	}

}
