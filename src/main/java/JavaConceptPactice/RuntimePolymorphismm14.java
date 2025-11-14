package JavaConceptPactice;

class bikesd {

	void call() {
		System.out.println("Call the mehod");
	}

}

class car extends bikesd {

	void call() {
		System.out.println("call the carF");
	}

}

public class RuntimePolymorphismm14 {

	public static void main(String[] args) {

		bikesd cd = new car();
		cd.call();
	}

}
