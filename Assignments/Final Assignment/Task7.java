import java.util.Scanner;

public class Task7 {

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

    private static boolean isPerfect(int n) {
        int total = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }

        }

        if (total == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7 };

        System.out.println("Prime Numbers");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.printf("%d: %d\n", i, arr[i]);
            }
        }

        System.out.println();

        System.out.println("Perfect Numbers");
        for (int i = 0; i < arr.length; i++) {
            if (isPerfect(arr[i])) {
                System.out.printf("%d: %d\n", i, arr[i]);
            }
        }
    }
}