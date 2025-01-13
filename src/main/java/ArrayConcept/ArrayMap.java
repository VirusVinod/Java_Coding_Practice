package ArrayConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayMap {

	public static void main(String[] args) {

		HashMap<Integer, Integer> gquiz1 = new HashMap<Integer, Integer>();

		gquiz1.put(1, 40);
		gquiz1.put(2, 30);
		gquiz1.put(3, 60);

		Iterator<Map.Entry<Integer, Integer>> itr = gquiz1.entrySet().iterator();

		System.out.print("\nThe map gquiz1 is : \n");
		System.out.print("KEY\tELEMENT\n");

		while (itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = itr.next();
			System.out.print('\t' + entry.getKey() + "\t" + entry.getValue() + "\n");
		}
	}
}
