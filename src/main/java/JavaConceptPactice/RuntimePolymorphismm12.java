package JavaConceptPactice;

class today {
	void run() {
		System.out.println("Today is holiday");
	}
}

class tomorrow extends today {
	void run() {
		System.out.println("Tomorrow is not holiday");

	}
}

public class RuntimePolymorphismm12 {

	public static void main(String[] args) {
		today tt = new tomorrow();
		tt.run();

	}

}
