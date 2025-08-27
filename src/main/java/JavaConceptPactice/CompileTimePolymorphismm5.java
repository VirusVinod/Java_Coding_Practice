package JavaConceptPactice;

public class CompileTimePolymorphismm5 {

	int sum(int a, int b) {
		return a + b;
	}

	int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		CompileTimePolymorphismm5 cpp = new CompileTimePolymorphismm5();

		System.out.println("call fisrt method : "+ cpp.sum(12, 120) );
		System.out.println("call second method : "+ cpp.sum(12, 120, 456) );

	}

}
