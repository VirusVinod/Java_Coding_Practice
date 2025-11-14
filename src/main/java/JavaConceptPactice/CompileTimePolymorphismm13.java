package JavaConceptPactice;

public class CompileTimePolymorphismm13 {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		CompileTimePolymorphismm12 ccb = new CompileTimePolymorphismm12();

		System.out.println("first add : " + ccb.add(10, 20));
		System.out.println("Second add : " + ccb.add(10, 20, 255));
	}

}
