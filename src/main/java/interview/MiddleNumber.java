package interview;

import java.util.Scanner;

public class MiddleNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] parts = input.split(" ");

		int[] arr = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
			arr[i] = Integer.parseInt(parts[i]);
		}

		int midIndex = arr.length / 2;
		System.out.println(arr[midIndex]);

		sc.close();
	}

}

// input 1 4 2