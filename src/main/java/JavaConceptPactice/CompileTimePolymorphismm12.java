package JavaConceptPactice;

public class CompileTimePolymorphismm12 {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {

		return a + b + c;
	}

	public static void main(String[] args) {
		CompileTimePolymorphismm12 cc = new CompileTimePolymorphismm12();

		System.out.println("methods 1st : " + cc.add(4, 5));
		System.out.println("methods 2st : " + cc.add(4, 5, 24));

	}

}
