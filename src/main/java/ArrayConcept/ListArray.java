package ArrayConcept;
import java.util.ArrayList;

public class ListArray {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");

		    cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)

		    System.out.println(cars);
	}

}
