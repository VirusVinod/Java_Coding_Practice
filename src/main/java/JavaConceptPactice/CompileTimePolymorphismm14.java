package JavaConceptPactice;

public class CompileTimePolymorphismm14 {

	int add(int a, int b) {

		return a + b;
	}

	int add(int a, int b, int c) {

		return a + b + c;
	}

	public static void main(String[] args) {

		CompileTimePolymorphismm14 cp14 = new CompileTimePolymorphismm14();

		System.out.println("First method : " + cp14.add(12, 10));
		System.out.println("Second method : " + cp14.add(12, 10, 345));

	}

}
