package JavaConceptPactice;

class computer {
	void ram() {
		System.out.println("In pc 16GB Ram install");
	}

}

class Laptop extends computer {
	void ram() {
		System.out.println("In Laptop 32GB Ram install");
	}
}

public class RuntimePolymorphismm10 {
	public static void main(String[] args) {
		computer cp = new Laptop();
		cp.ram();

	}
}
