package codingpactice1;

public class ReversingTheIntArray1 {

	public static void main(String[] args) {

		int[] arr = { 22, 11, 23, 23, 45, 67 };
		String rev = "";

		for (int i = 0; i < arr.length; i++) {

			rev = arr[i] + " " + rev;
		}
		System.out.println(rev);
	}

}
