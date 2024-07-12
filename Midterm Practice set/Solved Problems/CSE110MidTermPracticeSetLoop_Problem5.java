import java.util.Scanner;

public class CSE110MidTermPracticeSetLoop_Problem5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter first value: ");
        int a = sc.nextInt();

        System.out.printf("Enter change: ");
        int d = sc.nextInt();

        System.out.printf("Enter last value: ");
        int lastVal = sc.nextInt();

        int term = 0, nextTerm = 0, n = 1;

        while (true) {
            term = a + (n - 1) * d;
            nextTerm = a + n * d;
            System.out.printf("%d", term);
            n++;

            if (nextTerm <= lastVal) {
                System.out.printf(", ");

            } else if (nextTerm > lastVal) {
                break;
            }
        }

    }
}