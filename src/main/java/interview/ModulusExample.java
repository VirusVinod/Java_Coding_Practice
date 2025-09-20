package interview;

import java.util.Scanner;

public class ModulusExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = gcd(a, b); // modulus operation
		System.out.println(c);

		sc.close();
	}

	static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
}
//input 20 3