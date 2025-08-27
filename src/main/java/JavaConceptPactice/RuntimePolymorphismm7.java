package JavaConceptPactice;

class phone {
	void iphone() {
		System.out.println("Iphone 16");
	}
}

class iphonemob extends phone {
	@Override
	void iphone() {
		System.out.println("iphone is new launch 17");
	}
}

public class RuntimePolymorphismm7 {

	public static void main(String[] args) {

		phone pp = new iphonemob();
		pp.iphone();

	}

}
