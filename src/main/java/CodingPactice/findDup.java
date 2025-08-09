package CodingPactice;

public class findDup {

	public static void main(String[] args) {

		int[] abc = { 2, 3, 1, 2, 3, 2, 6, 8, 6 ,9,10,9};
		int n = abc.length;

		for (int i = 0; i < n; i++) {
			boolean isdup = false;
			
			for(int j = 0; j<i;j++) {
				if(abc[i]==abc[j]) {
					isdup = true;
					break;
				}
			}
			if(!isdup) {
				System.out.print(abc[i] + ",");
			}

		}

	}

}
