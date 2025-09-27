package arrayconcept;

import java.util.Scanner;

public class JavaRegex {

	String pattern = "^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}" + "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		JavaRegex myRegex = new JavaRegex();

		while (scanner.hasNext()) {
			String IP = scanner.next();
			System.out.println(IP.matches(myRegex.pattern));
		}

		scanner.close();

	}

}

//Sample Input:
//Copy code
//000.12.12.034
//121.234.12.12
//23.45.12.56
//00.12.123.123123.123
//122.23
//Hello.IP
