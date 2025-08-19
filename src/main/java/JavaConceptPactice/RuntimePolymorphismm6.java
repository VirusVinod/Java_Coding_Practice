package JavaConceptPactice;

class NokiaMobile {
	void display() {
		System.out.println("dispaly is 4.5 ich");
	}
}

class Iphone extends NokiaMobile {
	void display() {
		System.out.println("Iphone dispaly is very good");
	}
}

public class RuntimePolymorphismm6 {

	public static void main(String[] args) {
		NokiaMobile nm = new Iphone();
		nm.display();

	}

}
