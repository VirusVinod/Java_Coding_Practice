package JavaConcept;

public class CompileTimePolymorphismm {

	int add(int a, int b) {

		return a + b;

	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		CompileTimePolymorphismm ctp = new CompileTimePolymorphismm();
		System.out.println("Two no add : " + ctp.add(4, 100));
		System.out.println("Three no add : " + ctp.add(4, 100, 3445));

	}

}

//Method Overloading