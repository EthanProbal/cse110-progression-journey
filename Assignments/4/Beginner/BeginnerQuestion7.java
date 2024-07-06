import java.util.Scanner;

public class BeginnerQuestion7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter number: ");
            int n = sc.nextInt();
            sum += n;
            System.out.printf("Sum = %d\n", sum);

        }

    }
}