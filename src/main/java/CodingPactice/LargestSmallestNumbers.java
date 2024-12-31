package CodingPactice;

import java.util.Arrays;

//Largest & Smallest Numbers In Array

public class LargestSmallestNumbers {

	public static void main(String[] args) {
		int numbers[] = { -10, 20, 5, 30, 4, 60 };
		int largest = numbers[0];
		int smallest = numbers[0];
		int i;
 
		for (i = 01; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}

		}
		System.out.println("Given aaray is: "+ Arrays.toString(numbers));
		System.out.println("Largest Number: "+ largest);
		System.out.println("Smallest Number: "+ smallest );
	}
}