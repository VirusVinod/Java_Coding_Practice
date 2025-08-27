package JavaConceptPactice;

class one {
	void run() {
		System.out.println("calling one");
	}
}

class two extends one {
	@Override
	void run() {
		System.out.println("class to is callling");
	}
}

public class RuntimePolymorphismm8 {

	public static void main(String[] args) {
		one oo = new two();
		oo.run();

	}

}
