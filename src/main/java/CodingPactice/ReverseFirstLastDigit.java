package CodingPactice;

import java.util.Scanner;

//Write a Java program to reverse first and last digit of number without converting it into a string.

public class ReverseFirstLastDigit {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        if (number < 10) {
	            System.out.println("Number with a single digit remains unchanged: " + number);
	            return;
	        }
 
	        int lastDigit = number % 10;
	        int firstDigit = number;
	        int divisor = 1;

	        while (firstDigit >= 10) {
	            firstDigit /= 10;
	            divisor *= 10;
	        }

	        int middlePart = (number % divisor) / 10;

	        int reversedNumber = (lastDigit * divisor) + (middlePart * 10) + firstDigit;

	        System.out.println("Number after reversing first and last digit: " + reversedNumber);

	}

}
