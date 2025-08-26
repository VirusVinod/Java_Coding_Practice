package JavaConceptPactice;

class abcCompany {
	void interview() {
		System.out.println("abc company is require python with selenium");
	}
}

class xyzCompany extends abcCompany {
	void interview() {
		System.out.println("xyz comapny is requiured java with selenium");

	}
}

public class RuntimePolymorphismm9 {

	public static void main(String[] args) {

		abcCompany aa = new xyzCompany();
		aa.interview();

	}

}
