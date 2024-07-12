import java.util.Scanner;

public class CSE110MidTermPracticeSetLoop_Problem7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the value of N: ");
        int N = sc.nextInt();
        int a = 3, d = 2, AT = 0, sum = 0, term = 0;

        double exp = 0;

        for (int n = 1; n <= N; n++) {
            AT = a + (n - 1) * d;
            exp = Math.pow(-1, (n - 1));
            term = (int) exp * AT;
            sum += term;
        }

        System.out.printf("%d\n", sum);

    }
}