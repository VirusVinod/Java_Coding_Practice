package ArrayConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class ArrayMap {

	public static void main(String[] args) {

		HashMap<Integer, Integer> gquiz1 = new HashMap<>();

		gquiz1.put(1, 40);
		gquiz1.put(2, 30);
		gquiz1.put(3, 60);

		System.out.print("\nThe map gquiz1 is : \n");
		System.out.print("KEY\tELEMENT\n");

		for (Entry<Integer, Integer> entry : gquiz1.entrySet()) {
			System.out.print('\t' + entry.getKey() + "\t" + entry.getValue() + "\n");
		}
	}
}
