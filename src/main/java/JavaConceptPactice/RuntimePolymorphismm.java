package JavaConceptPactice;

class pix {
	void pixclass() {
		System.out.println("Classes provided BCA");
	}
}

class plxeles extends pix {
	void pixclass() {
		System.out.println("class is provided for BCA and MCA");
	}
}

public class RuntimePolymorphismm {

	public static void main(String[] args) {
		
		
		pix pp = new plxeles();
		pp.pixclass();

	}

}
