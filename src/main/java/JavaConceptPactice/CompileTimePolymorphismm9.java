package JavaConceptPactice;

public class CompileTimePolymorphismm9 {

	int laptop(int a, int b) {
		return a + b;

	}

	int laptop(int a, int b, int c) {
		return a + b + c;

	}

	public static void main(String[] args) {
		CompileTimePolymorphismm9 cc = new CompileTimePolymorphismm9();
		System.out.println("first method : " + cc.laptop(23, 20));
		System.out.println("Second method : " + cc.laptop(23, 20, 123));

	}

}
