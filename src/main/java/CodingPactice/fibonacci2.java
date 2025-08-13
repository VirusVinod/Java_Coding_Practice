package CodingPactice;

public class fibonacci2 {

	public static void main(String[] args) {
		int n = 10, fristItem = 0, secondItem = 1;

		for (int i = 1; i <= n; i++) {
			System.out.print(fristItem+ " ,");
			
			int nextItem = fristItem+secondItem;
			fristItem = secondItem;
			secondItem = nextItem;
			
		}

	}

}
