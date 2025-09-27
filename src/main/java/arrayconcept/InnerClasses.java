package arrayconcept;

public class InnerClasses {
	int x = 10;

	class InnerClass {
		int y = 5;

	}

	public static void main(String[] args) {
		InnerClasses myOuter = new InnerClasses();
		InnerClasses.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}

}
