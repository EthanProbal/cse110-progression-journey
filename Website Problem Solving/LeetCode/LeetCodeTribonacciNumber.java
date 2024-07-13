import java.util.Scanner;

public class LeetCodeTribonacciNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Number of Terms (must be bigger than or equal to 3): ");
        int n = sc.nextInt();

        System.out.printf("Enter the Nth term (must be smaller than %d): ", n);
        int term = sc.nextInt();

        int[] tribonacciSeriesNum = new int[n];

        tribonacciSeriesNum[0] = 0;
        tribonacciSeriesNum[1] = 1;
        tribonacciSeriesNum[2] = 1;

        for (int i = 3; i < n; i++) {
            tribonacciSeriesNum[i] = tribonacciSeriesNum[i - 1] + tribonacciSeriesNum[i - 2]
                    + tribonacciSeriesNum[i - 3];
        }

        System.out.printf("Tribonacci Series: ");

        for (int j = 0; j < tribonacciSeriesNum.length - 1; j++) {
            System.out.printf("%d, ", tribonacciSeriesNum[j]);
        }
        System.out.printf("%d\n", tribonacciSeriesNum[tribonacciSeriesNum.length - 1]);

        System.out.printf("%dth Term: %d\n", term, tribonacciSeriesNum[term - 1]);

    }
}