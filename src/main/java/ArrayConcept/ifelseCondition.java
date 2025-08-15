package ArrayConcept;

import java.util.Scanner;

public class ifelseCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Your age is: " + age);

		if(age>18) {
			System.out.println("Adult");
		}else {
			System.out.println("Not adult");
		}
	}


}
