import java.util.Scanner;

public class CSE110MidTermPracticeSetLoop_Problem6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter value of n: ");
        int n = sc.nextInt();
        double sum = 0, term = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                term = -Math.pow(i, -1);
                sum += term;
            } else if (i % 4 != 0) {
                term = Math.pow(i, -1);
                sum += term;
            }
        }

        System.out.printf("%f\n", sum);

    }
}