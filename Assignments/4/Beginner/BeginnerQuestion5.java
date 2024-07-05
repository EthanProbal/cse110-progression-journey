import java.util.Scanner;

public class BeginnerQuestion5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter an integer: ");
        int N = sc.nextInt();

        int pos = 0;
        int neg = 0;

        int num = 0;

        for (int i = 1; i <= N; i++) {
            System.out.printf("Enter number %d: ", i);
            num = sc.nextInt();

            if (num >= 0)
                pos++;
            else if (num < 0)
                neg++;
        }

        System.out.printf("%d Non-negative Numbers\n", pos);
        System.out.printf("%d Negative Numbers\n", neg);

    }
}