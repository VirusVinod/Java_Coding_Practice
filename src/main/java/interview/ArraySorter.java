package interview;

import java.util.Arrays;

public class ArraySorter {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 5,9, 2, 9, 1, 5, 6,8 };

		Arrays.sort(array);
		System.out.println("Sorted using Arrays.sort(): " + Arrays.toString(array));

		int[] array2 = { 5, 2, 9, 1, 5, 6,3 };
		bubbleSort(array2);
		System.out.println("Sorted using Bubble Sort: " + Arrays.toString(array2));
	}
}
