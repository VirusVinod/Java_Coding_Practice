package JavaConceptPactice;

public class CompileTimePolymorphismm3 {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		CompileTimePolymorphismm3 cc = new CompileTimePolymorphismm3();
		System.out.println("Fisrts method :" + cc.add(12, 17) );
		System.out.println("Second method :" + cc.add(12, 17,34) );
	}

}
