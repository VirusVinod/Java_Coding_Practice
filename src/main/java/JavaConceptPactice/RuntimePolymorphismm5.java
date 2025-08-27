package JavaConceptPactice;

class lap {
	void laptop() {
		System.out.println("This is a 7th gen leaptop");
	}
}

class lappy extends lap {
	@Override
	void laptop() {
		System.out.println("This is a i7 and 11th gen laptop");
	}
}

public class RuntimePolymorphismm5 {

	public static void main(String[] args) {

		lap ll = new lappy();
		ll.laptop();

	}

}
