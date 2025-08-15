package JavaConceptPactice;


class Bikespl{
	void run() {

		System.out.println("Bike is running");
	}
}


class HeroBike extends Bikespl{
	@Override
	void run() {
		System.out.println("Hero bike is running as per 60km");
	}

}

public class RuntimePolymorphismm3 {

	public static void main(String[] args) {

		HeroBike bb = new HeroBike();
		bb.run();


	}

}
