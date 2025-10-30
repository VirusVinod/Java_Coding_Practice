package access;

public class B {

	public static void main(String[] args) {
		A bb = new A();

		bb.setAge(24);
		bb.setName("Autonation");

		System.out.println("Age : " + bb.getAge());
		System.out.println("Name : " + bb.getName());

	}

}
