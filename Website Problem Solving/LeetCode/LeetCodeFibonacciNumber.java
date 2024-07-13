import java.util.Scanner;

public class LeetCodeFibonacciNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Number of Terms (must be greater than 2): ");
        int n = sc.nextInt();

        int[] fibonacciNums = new int[n];
        fibonacciNums[0] = 0;
        fibonacciNums[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciNums[i] = fibonacciNums[i - 2] + fibonacciNums[i - 1];
        }

        for (int j = 0; j < fibonacciNums.length - 1; j++) {
            System.out.printf("%d, ", fibonacciNums[j]);
        }
        System.out.printf("%d", fibonacciNums[n - 1]);

    }
}