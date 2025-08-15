package JavaConceptPactice;

public class CompileTimePolymorphismm4 {

	int add(int a, int b) {
		return a+b;
	}

	int add(int a, int b, int c) {
		return a+b+c;
	}


	public static void main(String[] args) {
		CompileTimePolymorphismm4 cc = new CompileTimePolymorphismm4();
		System.out.println("Fisrt method :"+ cc.add(2, 30));
		System.out.println("Secon method :"+ cc.add(16, 120,16));
	}

}
