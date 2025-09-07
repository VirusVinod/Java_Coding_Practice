package CodingPactice;

public class MissingNumber1 {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6,7,8,9};
		int n = arr.length+1;
		int exp = n*(n+1)/2;
		int actres = 0;
		for(int i : arr) {
			actres +=i;
		}
		System.out.print(exp-actres);

	}

}
