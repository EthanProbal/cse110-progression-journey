import java.util.Scanner;

public class FinalAssignment_3 {

    private static boolean isPrime(int n) {
        int divisorCount = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorCount++;
            }
        }

        if (divisorCount == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(isPrime(100));

    }
}