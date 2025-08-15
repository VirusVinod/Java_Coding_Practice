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
        for (String element : array) {
            boolean isDuplicate = false;
            for (String element2 : uniqueList) {
                if (element.equals(element2)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueList.add(element);
            }
        }

        String[] uniqueArray = uniqueList.toArray(new String[0]);

        System.out.println("Array after removing duplicates:");
        for (String item : uniqueArray) {
            System.out.print(item + " ");
        }


	}

}
