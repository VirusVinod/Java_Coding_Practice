package CodingPactice;

public class dupint {

	public static void main(String[] args) {

		int[] abc = {2,1,2,4,5,7,8,0,1,3};
		int n = abc.length;

		for(int i=0; i<n;i++) {
			boolean isdup = false;

			for(int j = 0;j<i;j++) {
				if(abc[i]==abc[j]) {
					isdup = true;
					break;
				}
			}

			if(!isdup) {
				System.out.print(abc[i]+ ",");
			}

		}

	}

}
