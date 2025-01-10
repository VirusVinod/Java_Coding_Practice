package ArrayConcept;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();

		switch (button) {
		case 1:
			System.out.println("Welcome");
			break;
		case 2:
			System.out.println("to");
			break;
		case 3:
			System.out.println("Java");
			break;
		case 4:
			System.out.println("Coding");
			break;
		default:
			System.out.println("Your Input is invalid");
		}
	}

}
