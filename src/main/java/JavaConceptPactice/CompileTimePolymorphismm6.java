package JavaConceptPactice;

public class CompileTimePolymorphismm6 {

	int multiply(int a, int b) {
		return a * b;
	}

	int multiply(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {
		CompileTimePolymorphismm6 pp = new CompileTimePolymorphismm6();
		System.out.println("multiply two variable : " + pp.multiply(12, 12));
		System.out.println("multiply three variable : " + pp.multiply(12, 13, 14));

	}

}
