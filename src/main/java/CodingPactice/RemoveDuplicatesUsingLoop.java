 package CodingPactice;

import java.util.ArrayList;

public class RemoveDuplicatesUsingLoop {

	public static void main(String[] args) {
		String[] array = {"apple", "banana", "apple", "orange"};

//        System.out.println("Original Array:");
//        for (String item : array) {
//            System.out.print(item + " ");
//        }
//        System.out.println();

        // Create a list to store unique elements
        ArrayList<String> uniqueList = new ArrayList<>();

        // Use nested loops to remove duplicates
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueList.size(); j++) {
                if (array[i].equals(uniqueList.get(j))) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueList.add(array[i]);
            }
        }

        String[] uniqueArray = uniqueList.toArray(new String[0]);

        System.out.println("Array after removing duplicates:");
        for (String item : uniqueArray) {
            System.out.print(item + " ");
        }
		

	}

}
