package JavaConceptPactice;

public class CompileTimePolymorphismm2 {

	int add(int a, int b) {
		return a - b;

	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		CompileTimePolymorphismm2 ctp = new CompileTimePolymorphismm2();
		System.out.println("Firts method : " + ctp.add(15,67));
		System.out.println("Secon method : " + ctp.add(15, 120, 567));

	}

}
