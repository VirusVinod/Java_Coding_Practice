package JavaConceptPactice;

public class CompileTimePolymorphismm1 {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b - c;
	}

	public static void main(String[] args) {
		CompileTimePolymorphismm1 cc = new CompileTimePolymorphismm1();
		System.out.println("Two add" + cc.add(4, 55));
		System.out.println("Send method call " + cc.add(4, 190, 123));

	}

}
