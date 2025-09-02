package JavaConceptPactice;

public class CompileTimePolymorphismm11 {
	int test(int a, int b) {
		return a + b;
	}

	int test(int a, int b, int c) {
		return a + b * c;
	}

	public static void main(String[] args) {
		CompileTimePolymorphismm11 cc = new CompileTimePolymorphismm11();
		System.out.println("first method : " + cc.test(11, 120));
		System.out.println("second method : " + cc.test(132, 120, 46));

	}

}
