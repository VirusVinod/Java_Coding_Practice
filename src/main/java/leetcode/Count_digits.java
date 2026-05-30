package leetcode;

public class Count_digits {

    public static void main(String[] args) {
        int n = 1234578;

        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                count++;
                n /= 10;
            }
        }

        System.out.println(count);
    }
}