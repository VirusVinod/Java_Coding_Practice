package CodingPactice;

public class FindDuplicatesElements {

	public static void main(String[] args) {
		int[] array = {1,2,2,3,3,4,5,6,7,8,8};
		int  i,j;
		
		for(i=0; i<array.length;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[i]== array[j]) {
					System.out.println(array[i]);
				}
			}
		} 
 
	}

}
  