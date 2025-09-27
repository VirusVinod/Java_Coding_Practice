package arrayconcept;

import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);

		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String str = scanner.next();
			int num = scanner.nextInt();


			System.out.printf("%-15s%03d%n", str, num);
		}
		System.out.println("================================");

	}

}

//================================
//Sample Input
//java 100
//cpp 65
//python 50
//
//================================
//Sample Output
//java           100
//cpp            065
//python         050