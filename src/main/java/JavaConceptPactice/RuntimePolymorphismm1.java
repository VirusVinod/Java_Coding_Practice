package JavaConceptPactice;

class bike {

	void run() {
		System.out.println("Bike isrunning");
	}

}

class splander extends bike {

	
	void run() {
		System.out.println("Running 60km per houbrs");
	}
}

public class RuntimePolymorphismm1 {

	public static void main(String[] args) {

		bike bb = new splander();
		bb.run();
	}

}
