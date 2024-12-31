package CodingPactice;

public class SwapWithThirdVariable {

	public static void main(String[] args) {
		int x = 100, y = 200,temp;
        
		temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
	}

}
