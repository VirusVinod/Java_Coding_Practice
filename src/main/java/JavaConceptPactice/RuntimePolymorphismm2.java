package JavaConceptPactice;

class BikeHero {

	void run() {
		System.out.println("Bike is running");
	}
}

class hero extends BikeHero {

	void run() {
		System.out.println("Hero Bike is running");
	}

}

public class RuntimePolymorphismm2 {

	public static void main(String[] args) {
		BikeHero bb = new hero();
		bb.run();

	}

}
