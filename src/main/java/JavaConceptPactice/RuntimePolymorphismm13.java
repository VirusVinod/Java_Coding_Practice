package JavaConceptPactice;

class bike {
	void run() {
		System.out.println("Bike is running");
	}
}

class splender extends bike {
	void run() {
		System.out.println("as per 40kb");
	}
}

public class RuntimePolymorphismm13 {
	public static void main(String[] args) {

		bike bb = new splender();
		bb.run();

	}

}
