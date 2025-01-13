package CodingPactice;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int num) {
		int cube = 0;
		int r;
		int t;

		t = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);

		}
		if (t == cube) {
			System.out.println(" This is Armstrong Number");
		} else {
			System.out.println(" This is Armstrong not Number");
		}

	}

	public static void main(String[] args) {
		isArmstrongNumber(1533);
	}

}
