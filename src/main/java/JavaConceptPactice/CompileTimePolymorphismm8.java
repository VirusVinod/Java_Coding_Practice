package JavaConceptPactice;

public class CompileTimePolymorphismm8 {

	int interview(int a, int b) {
		return a / 2;
	}

	int interview(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {
		CompileTimePolymorphismm8 cc = new CompileTimePolymorphismm8();
		System.out.println("firts method : " + cc.interview(12, 2));
		System.out.println("second method : " + cc.interview(12, 222, 111));

	}

}
