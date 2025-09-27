package arrayconcept;

public class ProblemStatement3 {
	public static int toggleBits(int N, int K) {
		int mask = (1 << K) - 1;

		return N ^ mask;
	}

	public static void main(String[] args) {
		int N = 12;
		int K = 5;

		int result = toggleBits(N, K);
		System.out.println("Result: " + result);
	}

}


//Problem statement
//You are given a 32-bit integer ‘N’. Your task is to toggle the rightmost ‘K’ bits in the given integer and return the new integer.

//For Example :
//If ‘N’ = 12 and ‘K’ = 2:
//The binary representation of 12 is ‘1100’, after toggling rightmost 2 bits, it becomes ‘1111’ i.e. 15. Hence, the answer is 15.
