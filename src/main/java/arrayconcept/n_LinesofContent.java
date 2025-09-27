package arrayconcept;

import java.util.Scanner;

public class n_LinesofContent {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineNumber = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        scanner.close();
	}

}


///Input Format

//Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.