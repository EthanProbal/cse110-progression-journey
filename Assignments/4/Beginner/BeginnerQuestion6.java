import java.util.Scanner;

public class BeginnerQuestion6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Input number of terms: ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("The odd numbers are: ");

        for (int i = 0; i < n; i++) {
            int oddNum = (2 * i) + 1;
            System.out.printf("%d\n", oddNum);
            sum += oddNum;
        }
        System.out.printf("The sum of odd Natural Numbers up to %d terms is: %d\n", n, sum);

    }
}