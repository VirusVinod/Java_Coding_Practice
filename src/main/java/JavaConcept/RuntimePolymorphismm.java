package JavaConcept;

class bike {
	void run() {
		System.out.println("bike is Running");
	}
}

class Splander extends bike {

	void run() {
		System.out.println("Hero bike is running 1km per 60");
	}
}

public class RuntimePolymorphismm {

	public static void main(String[] args) {
		bike b = new Splander();
		b.run();

	}

}
