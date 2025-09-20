package interview;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		String[] parts = input.split(",");

		int max = Integer.MIN_VALUE;
		for (String part : parts) {
			int num = Integer.parseInt(part.trim());
			if (num > max) {
				max = num;
			}
		}

		System.out.println(max);
		sc.close();

	}

}

//input 1,6,2,90,7
