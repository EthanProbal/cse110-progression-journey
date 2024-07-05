import java.util.Scanner;

public class BeginnerQuestion4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = sc.nextInt();

        System.out.printf("Divisors of %d:\n", num);

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.println(i);

        }

    }
}