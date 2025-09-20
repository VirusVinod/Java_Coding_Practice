package interview;

import java.util.Scanner;

public class ConcatenatingYearDayMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // e.g., 19/23/1859
		sc.close();

		System.out.println("Enter the month day year");
		
		String[] parts = input.split("/");

		if (parts.length != 3) {
			System.out.println("Invalid input");
			return;
		}

		// Rearrange as year + day + month
		String output = parts[2] + parts[0] + parts[1];
		System.out.println(output);
	}
}
