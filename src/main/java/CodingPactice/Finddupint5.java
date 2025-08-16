package CodingPactice;

public class Finddupint5 {

	public static void main(String[] args) {
		
		int[] org = {2,3,4,1,4,2,2,3,4,1,4,2,2,3,4,1,4,2};
		int n = org.length;
		
		for(int i = 0; i<n; i++) {
			boolean isdup = false;
			
			for(int j=0;j<i;j++) {
				if(org[i]==org[j]) {
					isdup =true;
					break;
				}
			}
			
			if(!isdup) {
				System.out.print(org[i]+",");
			}
		}

	}

}
