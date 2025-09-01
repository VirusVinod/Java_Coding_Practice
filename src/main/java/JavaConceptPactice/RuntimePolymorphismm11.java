package JavaConceptPactice;


class A{
	void Test() {
		System.out.println("Tommarow Test for abc");
	}
}

class B extends A{
	void Test() {
		System.out.println("Today test for xyz");
	}
}


public class RuntimePolymorphismm11 {

	public static void main(String[] args) {
		A aa = new B();
		aa.Test();
				

	}

}
