import java.util.Scanner;

public class FinalAssignment_4 {

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

        System.out.println(isPerfect(28));

    }
}