package arrayconcept;

public class StaticIOuterClass {

	int x = 10;

	static class InnerClass {
		int y = 15;

	}

	public static void main(String[] args) {
		StaticIOuterClass.InnerClass myInner = new StaticIOuterClass.InnerClass();
		System.out.println(myInner.y);
	}

}
