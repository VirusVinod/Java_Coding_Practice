package AskingInteviewQuestion;

public class MinMaxArray {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 5, 6, 1, 8, 99, 45,0 };

		int min = numbers[0];
		int max = numbers[0];

		for (int num : numbers) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}

		System.out.println("Smallest number: " + min);
		System.out.println("Largest number: " + max);
	}
}
