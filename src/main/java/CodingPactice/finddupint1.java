package CodingPactice;

public class finddupint1 {

	public static void main(String[] args) {

		int[] abc = { 1, 8, 9, 4, 1, 5, 7, 8, 9 };
		int n = abc.length;

		for (int i = 0; i < n; i++) {
			boolean isdup = false;

			for (int j = 0; j < i; j++) {
				
				if(abc[i]== abc[j]) {
					isdup = true;
					break;
				}

			}
			
			if(!isdup) {
				System.out.print(abc[i]+",");
			}
		}

	}

}
