package CodingPactice;

public class CompileTimePolymorphism {

	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {

		CompileTimePolymorphism cp = new CompileTimePolymorphism();

		System.out.println("Integer" + cp.add(3, 5));
		System.out.println("Integer" + cp.add(2, 3.6));
	}

}
