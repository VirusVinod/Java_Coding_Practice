package CodingPactice;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int n = 13;
		boolean isPrime = true;

		if (n <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}

			}
		}
		if (isPrime)
			System.out.println(n + " prime no");
		else
			System.out.println(n + " not prime no");

	}

}
