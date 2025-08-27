package JavaConceptPactice;


class QA {
	void testing() {
		System.out.println("After Build QA perfrom the smoke testing");
	}
}


class QAEngineer extends QA{
	@Override
	void testing() {
		System.out.println("after build qa perform regration testing");
	}
}

public class RuntimePolymorphismm1 {

	public static void main(String[] args) {

		QA qa = new QAEngineer();
		qa.testing();


	}

}
