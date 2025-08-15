package CodingPactice;

class Bike {
	void run() {
		System.out.println("Running");
	}
}

class Splander extends Bike {
	@Override
	void run() {
		System.out.println("x Running safely with 60km");
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		Bike b = new Splander();
		b.run();
	}

}
