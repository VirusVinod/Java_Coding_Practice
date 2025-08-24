package JavaConceptPactice;

public class CompileTimePolymorphismm7 {

	int one(int a, int b) {
		return a / b;
	}

	int one(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		CompileTimePolymorphismm7 ctp = new CompileTimePolymorphismm7();
		System.out.println("first method  is calling : " + ctp.one(12, 2));
		System.out.println("Second method  is calling : " + ctp.one(121, 32, 122));

	}

}
