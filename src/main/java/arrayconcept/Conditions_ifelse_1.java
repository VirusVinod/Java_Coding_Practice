package arrayconcept;

import java.util.Scanner;

public class Conditions_ifelse_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();

		if(a==b) {
			System.out.println("Equal");
		}else if (a>b){
			System.out.println("a is greater then");
		}else {
			System.out.println("b is lasser ");
		}
	}

}
