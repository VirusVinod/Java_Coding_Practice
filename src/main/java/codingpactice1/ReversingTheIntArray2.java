package codingpactice1;

public class ReversingTheIntArray2 {

	public static void main(String[] args) {

		int[] arr = { 2, 34, 56, 22, 3, 45 };
		String rev = "";

		for (int i = 0; i < arr.length; i++) {
			rev = arr[i] + " " + rev;
		}
		System.out.println(rev);
	}

}
