package JavaConceptPactice;

class iphone {

	void call() {
		System.out.println("phone is ringing");
	}
}

class cellphone extends iphone {
	void call() {
		System.out.println("out of reach");
	}

}

public class RuntimePolymorphismm15 {

	public static void main(String[] args) {
		iphone cc = new cellphone();
		cc.call();
	}

}
