package JavaConceptPactice;



class SDET{
	void check() {
		System.out.println("SDET write a script");
	}
}

class QAMaager extends SDET{
	void check() {
		System.out.println("QA Manager Assign the the task");
	}
}

public class RuntimePolymorphismm4 {

	public static void main(String[] args) {
		SDET sd = new QAMaager();
		sd.check();

	}

}
