package JavaConceptPactice;

public class CompileTimePolymorphismm10 {

	int abc(int a, int b) {

		return a * b;

	}

	int abc(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		CompileTimePolymorphismm10 cc = new CompileTimePolymorphismm10();
		System.out.println("first method : " + cc.abc(22, 12));
		System.out.println("second method : " + cc.abc(22, 123, 12));

	}

}
