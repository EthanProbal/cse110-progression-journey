import java.util.Scanner;

public class LeetCodeNthUglyNumber {

    private static int nthUglyNumber(int n, int a, int b, int c) {
        int start = 1;
        int uglyCount = 0;

        while (true) {
            boolean con1 = (start % a == 0);
            boolean con2 = (start % b == 0);
            boolean con3 = (start % c == 0);

            if (con1 || con2 || con3) {
                start++;
                uglyCount++;
            } else {
                start++;
            }

            if (uglyCount == n) {
                return (start - 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(nthUglyNumber(5, 2, 11, 13));

    }
}